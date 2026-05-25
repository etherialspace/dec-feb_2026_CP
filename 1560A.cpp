#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;int k=1;
	for(int i=0;i<n;i++)
	{
		int num;cin>>num;
		for(;;k++)
		{	
		if (k==1000)
			{
				cout<<1666<<endl;
				break;
			}
			if(k%3!=0&&k%10!=3)
			{
				if(k>=num)
				{
					cout<<k<<endl;
					k++;
					break;
				}
			}
		}
	}
}
// 10
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 1000

// 1
// 2
// 4
// 5
// 7
// 8
// 10
// 11
// 14
// 1666
