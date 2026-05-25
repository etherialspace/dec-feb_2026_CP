#include<iostream>
using namespace std;
const double pi=3.14151;
#define pi 3.14159;
#define newLine '\n';
const char newline='\n';
int main()
{
	int y;
	string s ("Hello");
	for(char g:s)
	{
		cout<<g<<endl;
	}
	int k=1;
	myprogram:
	cout<<k<<"print ";
	if(k++<5) goto myprogram ;
	cout<<endl;
	for(int i=0;i<10;i++)
	{
		cin>>y;
		cout<<y;
	}
	cout<<endl;
	int j=10;
	while(j>0)
	{
		cout<<j<<", ";
		j--;
	}
	cout<<"liftoff!\n";
	int d=( y=10,y+2);
	int x=sizeof(char);
	cout<<x;
	cout<<newline;
	cout<<d<<y;
	string mystr;
	cout<<"What's your name";
	cin>>mystr;
	cout<<'h'<<mystr;
	getline(cin,mystr);
	cout<<mystr;
	int p=int(3.16161);
	cout<<p;
	int a,b=5;
	int c;
	a=b=c=6;
	cout<<a<<c;
	cout<<newLine;
	cout<<pi;
	cout<<newLine;
	bool f=false;
	cout<<f<<'\n';
	cout<<pi;
	f=true;
	cout<<newline;
	cout<<f<<'\n';
	int* ptr=nullptr;
	cout<<ptr;
}