#include<iostream>

using namespace std;
typedef long long ll;
int main()
{
	int arr[5][5]={
		{1,2,9,10,25},
		{4,3,8,11,24},
		{5,6,7,12,23},
		{16,15,14,13,22},
		{17,18,19,20,21}
	};
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int a,b;
		cin>>a>>b;
		cout<<arr[a-1][b-1]<<endl;
	}

}
// 3
// 2 3
// 1 1
// 4 2