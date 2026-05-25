#include<iostream>
#include<algorithm>
using namespace std;

int main()
{
	int number;
	cin>>number;
	while(number--)
	{
		int len;int count=0;
		cin>>len;int evenCount=0;int oddCount=0;int arr[len];
		for(int i=0;i<len;i++)
		{
			cin>>arr[i];
		}
		for(int i=0;i<len-1;i++)
		{// {	cout<<arr[i]<<" "<<arr[i+1]<<endl;
			bool d=(arr[i]%2==0&&arr[i+1]%2!=0)||(arr[i]%2!=0&&arr[i+1]%2==0);
			if(d==false)
				count++;
		}
		if(count!=0)
			cout<<"NO"<<'\n';
		else
			cout<<"YES"<<'\n';

	}
	// while(number--)
	// {
	// 	int len;int color[len];int index=0;int counta=0;int countb=0;
	// 	cin>>len;int arr[len];int color[len]
	// 	for(int i=0;i<len;i++)
	// 	{
	// 		cin>>arr[i];
	// 	}
	// 	for(int i=1;i<len;i+=2)
	// 	{
	// 		color[index++]=arr[i];
	// 	}
	// 	sort(arr,arr+len);
	// 	for(int i=0;i<len;i++)
	// 	{	
	// 		for(int j=0;j<index;j++)
	// 		{
	// 			if(arr[i]==color[j]&&(i+1)%2==0)
	// 			{
	// 				counta++;
	// 			}
	// 			if(arr[i]==color[j]&&(i+1)%2!=0)
	// 			{
	// 				countb++;
	// 			}
	// 		}
	// 	}
	// 	cout<<counta<<countb<<endl;
		
	// }
}

// 4
// 4
// 2 3 4 1
// 3
// 2 3 1
// 5
// 3 4 1 2 5
// 5
// 3 1 4 2 5
