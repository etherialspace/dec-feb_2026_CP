#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int number;
		cin>>number;
		int arr[number];
		int index=0;
		arr[0]=1;index++;
		for(int k=3;k<=number;k++)
		{
			for(int c:arr)
			{
				if(k-2==c)
				{
					arr[index++]=k;
				}
				if(k-1==c)
				{
					arr[index++]=k;
				}
			}
		}
	}
	for(int c:arr)
	{
		cout<<c;
	}
}
// 4
// 1
// 8
// 7
// 42
