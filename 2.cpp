#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int a,b,c,d;
	cin>>a>>b>>c>>d;
	int minimum=min({a,b,c,d});
	int maximum=max({a,b,c,d});
	cout<<maximum-minimum;

}

// 7 10
// 4 8