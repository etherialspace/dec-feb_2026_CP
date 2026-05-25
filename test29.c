#include <stdio.h>

void print_rev(int n) {
    if (n > 0) {
        char a;
        scanf(" %c", &a);        
        print_rev(n - 1);
        printf("%c", a);
    }
}

int main() {
    print_rev(5);
    return 0;
}