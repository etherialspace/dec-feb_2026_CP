#include<iostream>
#include<string>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int k=0;k<n;k++)
	{
		int m;
		cin>>m;
		string s;
		cin>>s;int count=0;
		for(int i=0;i<m-1;i++)
		{	
			if(s.at(i)!=s.at(i+1))
			{	
				char ch=s.at(i);
				
				for(int j=i+1;j<m;j++)
				{
					if(ch==s.at(j))
					{	
						count++;
						goto label;

					}
				}
			}
		}
		label:
		if(count>0)
		{
			cout<<"NO"<<endl;
		}
		else
		{
			cout<<"YES"<<endl;
		}
	}
}
// 5
// 3
// ABA
// 11
// DDBBCCCBBEZ
// 7
// FFGZZZY
// 1
// Z
// 2
// AB
