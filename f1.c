#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
int main()
{
	int p1,p2,p;
	p=fork();
	
	if(p==0)
	{
		p1=fork();
		p2=fork();
		if(p1==0&&p2!=0)
			printf("hello");
		if(p2==0&&p1!=0)
			printf("DITU");
		else if(p==0&&p1!=0&&p2!=0)
			printf("University");
	}
	else
		printf("Gate no-1");
	return 0;
}