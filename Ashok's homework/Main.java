#include<iostream>
using namespace std;
int main()
{
int r,c,i,j;
cin>>r;
cin>>c;
int m1[r][c];
int m2[r][c];
int m3[r][c];

for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cin>>m1[i][j];
}
}
  
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cin>>m2[i][j];
}
}
  
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
m3[i][j]=m1[i][j]+m2[i][j];
}
}
  
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
cout<<m3[i][j]<<" ";
}
 cout<<"\n";
}
}