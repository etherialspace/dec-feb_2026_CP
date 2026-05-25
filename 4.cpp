#include <iostream>
#include<algorithm>
using namespace std;
typedef long long ll;
typedef string str;


int main()
{
	str s;
	cin>>s;

	char ch;ll count=0;ll maximum=0;
	for(int i=0;i<s.size();i++)
	{
		if(i==0)
		{
			ch=s.at(i);
			count++;
		}
		else if(s.at(i)==ch)
		{
			count++;
		}
		else
		{
			count=1;
			ch=s.at(i);
		}

		if(maximum<count)
		{
			maximum=count;
		}
	}
	cout<<maximum;
}
