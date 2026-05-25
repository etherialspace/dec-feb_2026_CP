#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n;
	cin>>n;
	while(n--)
	{
		int x;
		cin>>x;int arr[x];
		int maximum=0;int index=0;
		for(int i=0;i<x;i++)
		{
			cin>>arr[i];
			if(arr[i]>maximum) {maximum=arr[i];index=i;}
		}


		
		cout<<maximum*x<<endl;
	}
}
// 4
// 5
// 2 1 4 5 3
// 2
// 5 1
// 3
// 3 2 1
// 2
// 6 7


// 25
// 10
// 9
// 14
