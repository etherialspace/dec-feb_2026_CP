#include<iostream>
using namespace std;
int main()
{
	long n;
	cin>>n;
	for(long i=0;i<n;i++)
	{
		int num;
		cin>>num;
		int s=num*2;
		int arr[s];
		for(int i=0;i<num*2;i++)
		{
			cin>>arr[i];

		}
		int even=0;int odd=0;
		for(int i=0;i<num*2;i++)
		{	
			if(arr[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		if(even==odd)
		{
			cout<<"YES";
		}
		else
		{
			cout<<"NO";
		}
		cout<<endl;
	}
	
}
// 5
// 2
// 2 3 4 5
// 3
// 2 3 4 5 5 5
// 1
// 2 4
// 1
// 2 3
// 4
// 1 5 3 2 6 7 3 4
