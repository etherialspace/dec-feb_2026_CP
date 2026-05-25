#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	int count=0;
	int max=0;
	for(int i=0;i<n;i++)
	{	
		if(arr[i]==-1)
		{
			count++;
		}
		else
		{
			count=count-arr[i];
		}
		if(count>0&&max<count)
		{
			max=count;
		}
	}
	cout<<max;
}
// 8
// 1 -1 1 -1 -1 1 1 1
