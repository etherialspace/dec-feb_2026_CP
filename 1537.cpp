#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n;
	cin>>n;
	while(n!=0)
	{
		int num;
		cin>>num;float arr[num];float sum=0;int neg=0;
		for(int i=0;i<num;i++)
		{
			cin>>arr[i];
			sum+=arr[i];
			if(arr[i]<0)
			{
				neg++;
			}
		}
		
		if(sum==num)
		{
			cout<<0<<endl;
		}
		else
		{
			if(sum<num)
			{
				//less
				cout<<1;
			}
			else
			{
				//more 
				cout<<sum-num;
			}
			cout<<endl;

		}
		// cout<<sum/num<<endl;
		n--;
	}
}
// 4
// 3
// 1 1 1
// 2
// 1 2
// 4
// 8 4 6 2
// 1
// -2
