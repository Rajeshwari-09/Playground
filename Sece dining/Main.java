#include<iostream>
using namespace std;
int main()
{
 //front 1 left
  //front 2 right
  //rear 1 right
  //rear 2 left
  string door;
  int rail;
  cin>>door;
  cin>>rail;
  string l_or_r;
  if(door == "front"){
   l_or_r = rail == 1 ? "Left Handed" : "Right Handed";
  }else{
     l_or_r = rail == 1 ?  "Right Handed" : "Left Handed";
  }
  cout<<l_or_r;
}
