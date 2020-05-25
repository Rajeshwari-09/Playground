#include<iostream>
using namespace std;
 
struct Employee {
    char name[50];
    int id;
    int age;
    char designation[50];
    float salary;
};
 
int main() {
    Employee e;
   
    cout<<"Enter name:";
    cin.getline(e.name, 50);
    cout<<"\nEnter ID:";
    cin>>e.id;
    cout<<"\nEnter age:";
    cin>>e.age;
    cout<<"\nEnter designation:";
    cin>>e.designation;
    cout<<"\nEnter Salary:";
     cin>>e.salary;
     
   
    cout<<"\nEmployee Details";
    cout<<"\nName of the Employee : "<<e.name;
    cout<<"\nID of the Employee : "<<e.id;
    cout<<"\nAge of the Employee : "<<e.age;
    cout<<"\nDesignation of the Employee : "<<e.designation;
    cout<<"\nSalary of the Employee : "<<e.salary;
    return 0;
}