#include<iostream>
using namespace std;

int main()
{
	int arr[]={2,3,4,5,3,1};
	int k=0;
	int x=1;
	int n=sizeof(arr)/sizeof(arr[1]);
	for(int b=n/2;b>0;b/=2)
	{
		while(k+b<n &&arr[k+b]<=x)
			k+=b;
		if(arr[k]==x)
			cout<<k+1;
			return 0;
	}
	for(int b=n/2;b<n;b=(b+n)/2)
	{
		while(k+b<n &&arr[k+b]<=x)
			k+=b;
		if(arr[k]==x)
			cout<<k+1;
		return 0;
	}
}