#include<iostream>
using namespace std;
int main()
{
	int n,k;
	cin>>n>>k;
	int timeLeft=240-k;
	//18
	int count=0;int i=1;
	while(timeLeft>=5*i)
	{
		if(n>0)
		{
			timeLeft-=5*i;
			i++;
			count++;
			n--;
		}
		else
		{
			break;
		}
	}
	cout<<count;
}

//3 222
//2