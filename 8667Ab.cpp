#include<iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;
	string s;
	cin>>s;
	if(s.at(0)=='S'&&s.at(s.size()-1)=='F')
	{
		cout<<"YES";
	}
	else
	{
		cout<<"NO";
	}
}