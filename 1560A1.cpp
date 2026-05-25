#include<iostream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		int num;
		cin>>num;int k=0;
		for(int j=1;j<=num;j++)
		{
			
			k++;
			while(k%3==0||k%10==3)
			{
				k++;
			}

		}
		cout<<k<<endl;
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
