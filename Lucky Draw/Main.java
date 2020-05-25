#include<iostream>
using namespace std;
int main()
{
int n, i;
cin>>n;
int isPrime=1;
if(n==1)
{
  isPrime=0;
}
for(i=2;i<n;i++)
{
if(n % i == 0)
{
isPrime = 0;
break;
}
}
if(isPrime==1)
cout<<"Eligible";
else
cout<<"Not eligible";
return 0;
}