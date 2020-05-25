#include<iostream>
using namespace std;
int main()
{
int n,i,flag=0,search;
cin>>n;
int a[n];
for(i=0;i<n;i++)
{
cin>>a[i];
}
cin>>search;
for(i=0;i<n;i++)
{
if(a[i]==search)
{
  flag=1;
cout<<"She passed her exam";
}
}
 if(flag==0)
 {
 cout<<"She failed";
} 
}