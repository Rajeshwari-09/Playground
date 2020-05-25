#include<iostream>
using namespace std;
int main()
{
  int num1,num2,num3;
  cin>>num1>>num2>>num3;
  
  if((num3 < num2) || (((num3 - 1) % num2) == 0) || ((num3 % num2) == 0))
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  return 0;
}
