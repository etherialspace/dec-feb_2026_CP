#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	long long n;
	cin>>n;
	long long arr[n];
	for(long long i=0;i<n-1;i++)
	{
		cin>>arr[i];

	}
	sort(arr,arr+n-1);

	for(long long i=0;i<=n-1;i++)
	{	
		if(i+1!=arr[i])
		{
			cout<<i+1;
			break;
		}
	}
}
// 5
// 2 3 1 5