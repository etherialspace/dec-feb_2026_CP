#include <iostream>
using namespace std;
typedef long long ll;

int main()
{
	int a[]={2,4,3,1,2,1};
	int length=sizeof(a)/sizeof(a[0]);

	int j;int key;
	for(int i=1;i<length;i++)
	{
		int j=i;
		while (j>0&&a[j-1]>a[j])
		{
			int temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
			j-=1;
		}
	}
	
	for(int i=0;i<length;i++)
	{
		cout<<a[i]<<" ";
	}
}
