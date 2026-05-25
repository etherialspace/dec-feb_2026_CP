#include<unistd.h>
#include<fcntl.h>
#include<stdio.h>
int main()
{
	int fd;
	char buffer[100];
	int n;
	fd=open("a.txt",O_RDONLY);
	if(fd<0)
	{
		printf("Error opening the file\n");
		return 1;	
	}	
	n=read(fd,buffer,sizeof(buffer));
	write(1,buffer,n);
	close(fd);
	return 0;
}