#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	while(n--!=0)
	{
		int arr[4];
		for(int i=0;i<4;i++)
		{
			cin>>arr[i];
		}
		int a,b;

		if(arr[0]>arr[1])
		{
			//0 in a 
			a=arr[0];
			arr[0]=0;
		}
		else
		{
			a=arr[1];
			arr[1]=0;
		}

		if(arr[2]>arr[3])
		{
			//0 in a 
			b=arr[2];
			arr[2]=0;
		}
		else
		{
			b=arr[3];arr[3]=0;
		}
		// cout<<a<<" "<<b;
		int count=0;
		for(int i=0;i<4;i++)
		{
			if(a>arr[i]&&b>arr[i])
			{
				count++;
			}
		}
		if(count==4)
		{
			cout<<"YES"<<endl;
		}
		else
		{
			cout<<"NO"<<endl;
		}
	}


}
// 4
// 3 7 9 5
// 4 5 6 9
// 5 3 8 1
// 6 5 3 2
