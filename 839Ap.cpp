#include<iostream>

using namespace std;

int main()
{
	int n,k,rough,ans;rough=0;ans=0;
	cin>>n>>k;
	while(n--)
	{
		int x;
		cin>>x;
		rough+=x;
		int m=min(8,rough);
		rough-=m;
		ans++;
		k-=m;
		if(k<=0)
			break;
	}
	if(k>0)
		cout<<-1<<"\n";
	else
		cout<<ans<<"\n";
}