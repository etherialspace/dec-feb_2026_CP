#include<iostream>

using namespace std;

int main()
{
	long long n;cin>>n;long long count=0;
	long long arr[n];
	for(long long i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	for(long long i=1;i<n;i++)
	{	
		while(!(arr[i]>=arr[i-1]))
		{
			count++;arr[i]++;
			
		}
	}
	cout<<count;
}
// 5
// 3 2 5 1 7