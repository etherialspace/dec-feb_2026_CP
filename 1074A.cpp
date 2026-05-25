#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;

int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int x;
		cin>>x;
		int j=1;
		for(int m=0;m<x;m++)
		{	
			while(j++!=0)
			{
				if(pow(j,2)!=0)
				{
					cout<<j<<" ";
					break;
				}
			}
		}
		cout<<endl;
	}
}