#include<iostream>
#include<string.h>
using namespace std;
struct student
{
char name[30];
int roll;
float marks;
};

int main() 
{
struct student s1;
cin.getline(s1.name,30);
cin>>s1.roll;
cin>>s1.marks;
cout<<"\nStudent Details";
cout<<"\nName: "<<s1.name;
cout<<"\nRoll: "<<s1.roll;
cout<<"\nMarks: "<<s1.marks;

return 0;
}