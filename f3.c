#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
void forkexample()
{
	int x = 1;
	pid_t p = fork();
	if (p == 0)
		printf("Child has x = %d\n", ++x);
	else
		printf("Parent has x = %d\n", --x);
}
int main()
{
	forkexample();
	return 0;
}