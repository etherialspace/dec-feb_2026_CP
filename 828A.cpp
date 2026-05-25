#include<iostream>

using namespace std;

int main()
{
	
	int n,a,b;
	cin>>n>>a>>b;
	int totalSeats=a+b*2;
	while(n--)
	{
		int x;
		cin>>x;
		totalSeats=totalSeats-x;
	}

	if(totalSeats<0) cout<<abs(totalSeats);
	else if(totalSeats>0) cout<<0;
	else cout<<totalSeats;
}

// 4 1 2
// 1 2 1 1
