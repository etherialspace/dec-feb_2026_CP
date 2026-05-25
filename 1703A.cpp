#include<iostream>
#include<string>
#include<algorithm>
#include<cctype>
using namespace std;
int main()
{
	int n;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		string s;
		cin>>s;
		transform(s.begin(),s.end(),s.begin(),::tolower);
		if(s=="yes")
		{
			cout<<"YES"<<endl;
		}
		else
		{
			cout<<"NO"<<endl;
		}
	}
}

// 10
// YES
// yES
// yes
// Yes
// YeS
// Noo
// orZ
// yEz
// Yas
// XES
