#include<stdio.h>
#include<unistd.h>
int main()
{
	if(fork())
	{
		if(!fork())
		{
			fork();
			printf("DIT\n");
		}
		else
		{
			printf("DITU\n");
		}
	}
	else
	{
		printf("DITUNI\n");
	}
	printf("SOC\n");
	return 0;
}