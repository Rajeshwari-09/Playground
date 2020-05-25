#include<iostream>
#include<math.h>
using namespace std;
struct complex
{
float rel;
float img;
}s1,s2;

int main()
{
int choice;
float a,b;
cin>>choice;

switch(choice)
{
case 1:
if(choice==1)
{
cin>>s1.rel;
cin>>s1.img;
cin>>s2.rel;
cin>>s2.img;
//Addition
a=(s1.rel)+(s2.rel);
b=(s1.img)+(s2.img);
cout<<a<<"+"<<b<<"i";
  break;
}

case 2:
if(choice==2)
{
cin>>s1.rel;
cin>>s1.img;
cin>>s2.rel;
cin>>s2.img;
//Subtraction
a=(s1.rel)-(s2.rel);
b=(s1.img)-(s2.img);
cout<<a<<"+"<<b<<"i";
break;
}

case 3:
if(choice==3)
{
cin>>s1.rel;
cin>>s1.img;
cin>>s2.rel;
cin>>s2.img;
  
//Multiplication
a=((s1.rel)*(s2.rel))-((s1.img)*(s2.img));
b=((s1.rel)*(s2.img))+((s1.img)*(s2.rel));
cout<<a<<b<<"i";
break;
}

default:
cout<<"Invalid choice";
}
}