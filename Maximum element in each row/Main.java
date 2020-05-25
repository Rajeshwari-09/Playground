#include<iostream>
using namespace std;
int main()
{
int a[10][10],i,j=0,r,max[10],c;
cin>>r;
cin>>c;

for(i=0;i<r;i++)
for(j=0;j<c;j++)
cin>>a[i][j];

for(i=0;i<r;i++)
{
max[i]=a[i][j];
for(j=0;j<c;j++)
if(a[i][j]>max[i])
max[i]=a[i][j];
}
for(i=0;i<r;i++)
cout<<max[i]<<"\n";
}
