#include<iostream>
#include<string.h>
using namespace std;
struct College
{
char name[100]; 
char city[100]; 
int establishmentYear; 
float passPercentage;
}s[100];

int main()
{
struct College temp; 
int i,j,n;
cout<<"Enter the number of colleges\n";
cin>>n;
for(i=1;i<=n;i++)
{
cout<<"Enter the details of college "<<i<<"\n";
cout<<"Enter name\n";
cin>>s[i].name;
cout<<"Enter city\n";
cin>>s[i].city;
cout<<"Enter year of establishment\n";
cin>>s[i].establishmentYear;
cout<<"Enter pass percentage\n";
cin>>s[i].passPercentage;
}
  
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(strcmp(s[i].name,s[j].name)>0)
{
temp = s[i];
s[i] = s[j];
s[j] = temp;
}
}
}  
cout<<"Details of colleges\n";
for(i=1;i<=n;i++)
{
cout<<"College:"<<i<<"\n";
cout<<"Name:"<<s[i].name<<"\n";
cout<<"City:"<<s[i].city<<"\n";
cout<<"Year of establishment:"<<s[i].establishmentYear<<"\n";
cout<<"Pass percentage:"<<s[i].passPercentage<<"\n";
}
return 0;
}
