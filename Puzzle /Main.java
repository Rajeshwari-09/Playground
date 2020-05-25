#include<iostream>
using namespace std;
int main()
{
int matrix[5][5],transpose_matrix[5][5];
int i,j,rows,cols;
cin>>rows;
cin>>cols;
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
cin>>matrix[i][j];
}
}      
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
transpose_matrix[j][i]=matrix[i][j];
}
}
for(i=0;i<cols;i++)
{
for(j=0;j<rows;j++)
{
cout<<transpose_matrix[i][j]<<" ";
}
cout<<endl;
}
return 0;
}