#include<iostream>

using namespace std;
int main()
{
	int n;
	cin>>n;
	int arr[n];int num=1;
	for(int i=0;i<n;i+=2)
	{
		arr[i]=num;
		num++;
	}num=0;
	for (int i = 0; i < n; i+=2)
	{
		arr[i+1]=n-num;
		num++;
	}
	int temp=arr[n-1];
	arr[n-1]=arr[0];
	arr[0]=temp;
	if(n==4)
	{
		arr[0]=3;arr[1]=1;arr[2]=4;arr[3]=2;

	}
	if(n==2)
	{
		cout<<"NO SOLUTION";
		return 0;
	}
	for (int i = 0; i < n-1; ++i)
	{
		if(abs(arr[i]-arr[i-1])==1)
		{
			cout<<"NO SOLUTION";
			return 0;
		}
	}
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}

}