#include<iostream>

using namespace std;
int main()
{
	int n;
	cin>>n;int arr[n];
	int a=1;int b=2;int c=3;
	for(int i=0;i<n;i++)
	{
		int m;
		cin>>m;
		if(m==c)
		{
			cout<<"NO";
			return 0;
		}
		//else m is winner
		if(a==m)
			swap(b,c);
		else
			swap(a,c);
	}
	cout<<"YES"<<"\n";
	return 0;

}

// 3
// 1
// 1
// 2
