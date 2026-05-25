#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

typedef long long ll;
typedef vector<int> vi;
typedef pair<int,int> pi;

#define PB push_back
#define MP make_pair
#define F first
#define S second
#define REP(i,a,b) for(int i=a;i<=b;i++)
#define SQ(a) (a)*(a)
int main()
{
	// v.push_back(make_pair(y1,x1));
	// v.push_back(make_pair(y2,x2));
	// int d=v[i].first+v[i].second;

	// v.PB(MP(y1,x1));
	// v.PB(MP(y2,x2));
	// int d=v[i].F+v[i].S;

	REP(i,1,20)
	{
		cout<<i<<" ";
	}	
	cout<<SQ(27);
}