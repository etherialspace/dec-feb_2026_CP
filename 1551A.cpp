#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		long double num;
		cin>>num;
		long double c1=num/3;long double c2=(num-c1)/2;
		
		long double decimalPoint=c1-int(c1);
		long a=int(c1);
		long b=static_cast<int>(ceil(c2));
		if(decimalPoint!=0.0)
		{
			if(a+2*b==num)
			{
				cout<<a<<" "<<b;
			}
			else
			{
				cout<<b<<" "<<a;
			}
		}
		else
		{
			cout<<int(c1)<<" "<<int(c2);	
		}
		cout<<endl;

	}
}

// 6
// 1000
// 30
// 1
// 32
// 1000000000
// 5


// 334 333
// 10 10
// 1 0
// 10 11
// 333333334 333333333
// 1 2
