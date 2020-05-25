#include<iostream>
using namespace std;
int main()
{
int n,i;
cin>>n;
int start =(11*11);
cout<<start<<" ";
for(i=1;i<n;i++)
{
int seris= ((11+4*i)*(11+4*i));
 cout<<seris<<" ";
}
}