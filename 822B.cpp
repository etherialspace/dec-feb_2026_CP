#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;

int main()
{
	int size_s,size_t;
	cin>>size_s>>size_t;
	string s;string t;
	cin>>s>>t;
	int count=0;int max=0;
	int arr[s.length()];int arr_length=0;int iterate=0;
	for(int i=0;i<t.length();i++)
	{
		if(t.at(i)==s.at(0))
		{
			iterate=1;
			for(int j=0;j<s.length();j++)
			{
				if(t.at(i+j)==s.at(j))
				{
					count++;

				}else
				{
					arr[arr_length++]=j+1;
				}
			}
			max=s.length()-count;
			count=0;
			arr_length=0;
		}
		else if (iterate==0)
		{
			max=s.length();
			for(int k=0;k<max;k++){arr[k++]=k+1;}
		}
	}
	
	cout<<max<<'\n';
	for(int d=0;d<max;d++)
	{
		cout<<arr[d]<<" ";
	}
}

// 3 5
// abc
// xaybz
