#include<iostream>

using namespace std;
int main()
{
	int s,v1,v2,t1,t2;
	cin>>s>>v1>>v2>>t1>>t2;
	int totalTime1,totalTime2;
	totalTime1=t1+(v1*s)+t1;
	totalTime2=t2+(v2*s)+t2;
	if(totalTime1==totalTime2)
	{
		cout<<"Friendship";
	}
	else if(totalTime1<totalTime2)
	{
		cout<<"First";
	}
	else
	{
		cout<<"Second";
	}
}
// 5 1 2 1 2
//s, v1, v2, t1, t2
//First
