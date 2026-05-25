#include<iostream>

using namespace std;

int main()
{
	int n;
	cin>>n;
	string s;
	cin>>s;int count=0;
	for(int i=0;i<s.size()-1;i++)
	{
		if(s.at(i)!=s.at(i+1))
		{
			if(s.at(i)=='S')
			{
				count++;
				
			}
			else
			{
				count--;
				
			}
		}
	}
	count--;
	if(count==0)
		cout<<"YES"<<'\n';
	else
		cout<<"NO"<<'\n';
}