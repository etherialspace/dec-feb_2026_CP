#include<iostream>
#include<cmath>
#include<algorithm>
using namespace std;
int main()
{
	int n,k,l,c,d,p,nl,np;
	cin>>n>>k>>l>>c>>d>>p>>nl>>np;
	int numOfBottles=k*l/nl;
	int limes=c*d;
	int gmOfSalt=p/np;
	int minimum=min({numOfBottles,limes,gmOfSalt});
	cout<<minimum/n;
}
//3 4 5 10 8 100 3 1
//2