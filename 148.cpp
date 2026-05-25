#include<iostream>
using namespace std;
int main()
{
	int k,l,m,n,d;
	cin>>k>>l>>m>>n>>d;
	int arr[d+1];
	for(int i=0;i<d;i++)
	{
		arr[i]=0;
	}
	int arr1[4]={k,l,m,n};
	for(int j=0;j<4;j++)
	{	
		for(int i=1;i<=d;i++)
		{
			if(i*arr1[j]>d)
			{
				break;
			}
			else
			{
				arr[i*arr1[j]]=1;
				

			}
		}	
	}
	int count=0;
	for(int i=1;i<=d;i++)
	{
		if(arr[i]!=0)
		{
			count++;
		}
	}
	cout<<count;
	


}
// 2
// 3
// 4
// 5
// 24

//17