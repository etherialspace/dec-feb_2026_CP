#include<iostream>

using namespace std;

int main()
{
	// int n,k;
	// cin>>n>>k;
	// int arr[n];
	// for(int i=0;i<n;i++)
	// {
	// 	cin>>arr[n];
	// }
	// int count=0;
	// while(k!=0)
	// {
	// 	if(k>8)
	// 	{
	// 		count++;
	// 		k=k-8;
	// 	}
	// 	else if(k<8)
	// 	{
	// 		count++;
	// 		k=k-k;
	// 		if(k>count){cout<<k;}else{cout<<-1;}
	// 		cout<<count;
	// 		return 0;
	// 	}
	// 	else 
	// 	{
	// 		count++;
	// 		k=k-k;
	// 		if(k>count){cout<<k;}else{cout<<-1;}
	// 		return 0;
	// 	}

	// }
	int n,k,cur,ans;
	cur=0;ans=0;
	cin>>n>>k;
	while(n--)
	{
		int x;
		cin>>x;
		cur+=x;
		int r=min(8,cur);
		cur -=r;
		k -=r;
		ans++;
		if(k<=0)
			break;
	}
	if(k>0)
	{
		cout<<-1<<'\n';
	}
	else
	{
		cout<<ans<<'\n';
	}
	return 0;
}


// 2 3
// 1 2
