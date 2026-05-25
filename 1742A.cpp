#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int a,b,c; cin>>a>>b>>c;
		if(((a+b==c)||(a+c==b))||(b+c==a))
		{
			cout<<"YES"<<endl;
		}
		else
		{
			cout<<"NO"<<endl;
		}
	}
}

// 7
// 1 4 3
// 2 5 8
// 9 11 20
// 0 0 0
// 20 20 20
// 4 12 3
// 15 7 8
