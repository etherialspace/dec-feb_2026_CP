#include<iostream>

using namespace std;
int main()
{
	int n;
	cin>>n;
	int a=1,b=2,c=3;
	for(int i=0;i<n;i++)
	{
		int m;
		cin>>m;

		if(m==c)
		{
			cout<<"NO";
			return 0;
		}
		//so game wins
		if(a==m)
		{
			swap(b,c);
		}
		else
			swap(a,c);
	}
	cout<<"YES"<<"\n";

}