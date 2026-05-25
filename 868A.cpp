#include<iostream>
#include<algorithm>
using namespace std;

typedef long long ll;
typedef string str;
int main()
{
	str s;cin>>s;
	int n;
	cin>>n;string arr[n];
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{	
			
			string sh=arr[i]+arr[j];
			for(int k=0;k<sh.size()-1;k++)
			{
				if(sh.at(k)==s.at(0)&&sh.at(k+1)==s.at(1))
				{
					cout<<"YES";
					return 0;
				}
			}
		}
	}
	cout<<"NO";


}
// ya
// 4
// ah
// oy
// to
// ha
