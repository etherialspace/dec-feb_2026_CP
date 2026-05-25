#include<iostream>
using namespace std;
int main()
{
	int k,r;
	cin>>k>>r;
	int i=1;
	while((i*k)%10!=0&&(i*k)%10!=r)
	{
		i++;
	}
	cout<<i;
}
// 117 3
//9
