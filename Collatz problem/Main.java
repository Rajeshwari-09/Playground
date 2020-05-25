#include<iostream>
using namespace std;
int main()
{
int n,i=0;
cin>>n;
cout<<n;
while(n!=1)
{
	if(n % 2 == 0){
	n=n/2;
	cout<<"\n"<<n;
	}else{        
	n = 3*n+1;
	cout<<"\n"<<n;
	}
  i++;
}
cout<<"\n"<<i;
}