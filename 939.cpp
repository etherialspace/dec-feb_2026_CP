#include<iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;int arr[n];
	for(int i=0;i<n;i++)
	{
		int x;cin>>arr[i];
	}
	for(int i=0;i<n;i++)
		{
			if(arr[arr[arr[i]]]==i)
			{
				cout<<"YES"<<'\n';
				return 0;
			}
		}
	cout<<"NO"<<'\n';
}