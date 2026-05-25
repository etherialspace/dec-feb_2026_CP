#include <stdio.h>

#define MAX_PROCS 100

typedef struct {
    int id;
    int arrival;
    int burst;
    int start_time;
    int completion;
    int remaining;
} Process;

Process procs[MAX_PROCS];
int n;

// Compute WT and TAT and print table
void print_metrics(const char* name) {
    printf("\n=== %s ===\n", name);
    printf("PID\tArrival\tBurst\tWT\tTAT\n");
    for (int i = 0; i < n; i++) {
        int tat = procs[i].completion - procs[i].arrival;
        int wt  = tat - procs[i].burst;
        printf("P%d\t%d\t%d\t%d\t%d\n", procs[i].id, procs[i].arrival, procs[i].burst, wt, tat);
    }
}

// Reset state for a new algorithm
void reset_procs() {
    for (int i = 0; i < n; i++) {
        procs[i].remaining    = procs[i].burst;
        procs[i].start_time   = -1;
        procs[i].completion   = -1;
    }
}

// RR with short quantum (e.g., 2)
void rr_short() {
    reset_procs();
    int q[MAX_PROCS];
    int front = 0, rear = 0;
    int time = 0, completed = 0;

    // Enqueue all (assume arrival already sorted)
    for (int i = 0; i < n; i++)
        q[rear++] = i;

    const int quantum = 2;

    printf("RR short (quantum = %d)\n", quantum);
    while (completed < n || front < rear) {
        if (front < rear) {
            int i = q[front++];

            if (procs[i].start_time == -1)
                procs[i].start_time = time;

            int used = 0;
            for (int t = 0; t < quantum && procs[i].remaining > 0; t++) {
                time++;
                used++;
                procs[i].remaining--;
            }

            if (procs[i].remaining == 0) {
                procs[i].completion = time;
                completed++;
            } else {
                q[rear++] = i; // push back to queue
            }
        } else {
            time++;
        }
    }
    print_metrics("RR (short quantum)");
}

// RR with large quantum (e.g., 4)
void rr_large() {
    reset_procs();
    int q[MAX_PROCS];
    int front = 0, rear = 0;
    int time = 0, completed = 0;

    for (int i = 0; i < n; i++)
        q[rear++] = i;

    const int quantum = 4;

    printf("\nRR large (quantum = %d)\n", quantum);
    while (completed < n || front < rear) {
        if (front < rear) {
            int i = q[front++];

            if (procs[i].start_time == -1)
                procs[i].start_time = time;

            int used = 0;
            for (int t = 0; t < quantum && procs[i].remaining > 0; t++) {
                time++;
                used++;
                procs[i].remaining--;
            }

            if (procs[i].remaining == 0) {
                procs[i].completion = time;
                completed++;
            } else {
                q[rear++] = i;
            }
        } else {
            time++;
        }
    }
    print_metrics("RR (large quantum)");
}

// FCFS
void fcfs() {
    reset_procs();
    int time = 0;
    int completed = 0;

    printf("\nFCFS\n");
    while (completed < n) {
        int ready = -1;
        for (int i = 0; i < n; i++) {
            if (procs[i].remaining > 0 && procs[i].arrival <= time) {
                if (ready == -1 || procs[i].arrival < procs[ready].arrival)
                    ready = i;
            }
        }

        if (ready == -1) {
            time++;
            continue;
        }

        int i = ready;
        if (procs[i].start_time == -1)
            procs[i].start_time = time;

        time += procs[i].remaining;
        procs[i].remaining = 0;
        procs[i].completion = time;
        completed++;
    }
    print_metrics("FCFS");
}

int main() {
    // Example processes (same for all three algorithms)
    procs[0] = (Process){.id = 1, .arrival = 0, .burst = 3};
    procs[1] = (Process){.id = 2, .arrival = 1, .burst = 6};
    procs[2] = (Process){.id = 3, .arrival = 2, .burst = 4};
    procs[3] = (Process){.id = 4, .arrival = 3, .burst = 10};

    n = 4;

    // Run all three scheduling algorithms in sequence
    rr_short();   // prints WT/TAT
    rr_large();   // prints WT/TAT
    fcfs();       // prints WT/TAT

    return 0;
}