#include<iostream>
#include<algorithm>
using namespace std;

typedef long long ll;
typedef string str;
int main()
{
	ll n;
	cin>>n;
	ll arr[n];
	for(ll i=0;i<n;i++)
	{
		arr[i]=i+1;
		
	}
	// arr[0]=2;
	// arr[1]=1;
	for(ll i=0;i<n;i++)
	{
		for(ll j=i+1;j<n;j++)
		{
			if(abs(arr[j]-arr[i])!=1)
			{
				ll temp=arr[j];
				arr[j]=arr[i+1];
				arr[i+1]=temp;
				break;
			}
			else if(j==n-1)
			{
				// cout<<"NO SOLUTION";
				// return 0;
			}
		}
	}
	for(ll i=0;i<n;i++)
	{
		cout<<arr[i]<<" ";
	}
}