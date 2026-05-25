#include<stdio.h>
#include<string.h>
int main(int argc, char const *argv[])
{
	char name[20];
	scanf("%s",name);
	int count=0;
	for(int i=0;i<strlen(name);i++)
	{	
		count++;
	}
	if(count%2==0)
	{
		//male even
		printf("IGNORE HIM!");
	}
	else
	{
		//female odd
		printf("CHAT WITH HER!");
	}
	return 0;
}