#include<iostream>
using namespace std;
int main()
{
int x;
cin>>x;
if(x==0)
cout<<0;
else if(x%9==0)
cout<<9;
else
cout<<x%9;
return 0;
}
