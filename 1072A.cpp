#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int numOfMembers;
		cin>>numOfMembers;
		int arr[1000];
		int index=0;
		while(numOfMembers>=3&&numOfMembers-3!=1)
		{
			arr[index++]=3;
			numOfMembers-=3;
			cout<<3<<" ";
		}
		while(numOfMembers>=2)
		{
			arr[index++]=2;
			numOfMembers-=2;
			cout<<2<<" ";
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<index;i++)
		{
			if((i+1)%2==0)
			{
				count1+=arr[i];
			}
			else
			{
				count2+=arr[i];
			}
		}
		
		if(index==1)
		{
			cout<<arr[0];
		}
		else 
		{
			cout<<endl<<count2-count1;
		}
		cout<<endl;
	}
}

// 3
// 2
// 5
// 12

// 2
// 1
// 0
