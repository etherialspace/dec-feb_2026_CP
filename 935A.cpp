#include<iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;int count=0;
	for(int i=0;i<n-1;i++)
	{
		int a=i+1;
		int b=(n-a)/a;
		if(a+(a*b)==n)
		{
			count++;
		}
	}
	cout<<count<<'\n';
}