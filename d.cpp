#include<iostream>
using namespace std;//using to include std
int main()
{
	string s;

	int a;
	a=10;//simple intitialization
	int b(20);//parenthesis
	int c{30};//braces 
	auto d=c;
	decltype(d) e;
	string mystring;
	mystring="hellotatabye";
	// cout<<75ll;

	bool t=true;
	cout<<t;
	int* ptr=nullptr;
	cout<<ptr;
	string mystring1("this is a string");
	string mystring2{"this is s string"};
	// cout<<mystring1;
	// cout<<mystring2;
	// cout<<e;
	// cout<<a<<b<<c;
	// cin>>s;//can be used without using std
	// cout<<endl<<s[s.size()-2];
	// std::cout<<endl<<s.size();
	return 0;
}