#include<iostream>
#include<string>
#include<cmath>
#include<sstream>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		string num;
		cin>>num;
		int count=0;
		int len=num.size();
		int m;
		int arr[len];int index=0;
		stringstream(num) >> m;
		for(int j=0;j<len;j++)
		{
			int ten=static_cast<int>(pow(10,len-j-1));
			if(m/ten!=0)
			{
				arr[index++]=(m/ten*ten);
				
				m=m%ten;
				count++;
			}	
		}
		cout<<count<<endl;
		for(int k=0;k<index;k++)
		{	
			int c=arr[k];
			if(c!=0)
			{
				cout<<c<<" ";
			}
		}
		cout<<endl;
	}
}


// 5
// 5009
// 7
// 9876
// 10000
// 10


// 2
// 5000 9
// 1
// 7 
// 4
// 800 70 6 9000 
// 1
// 10000 
// 1
// 10 
