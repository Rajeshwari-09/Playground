#include<iostream>
using namespace std;
int main( )
{
char str[80];
cin.getline(str, 80);	
int l;
for(l = 0; str[l] != '\0'; l++);
int temp;
for(int i = 0, j = l - 1; i < l/2; i++, j--)
{
temp = str[i];
str[i] = str[j];
str[j] = temp;		
}
cout<<str;
return 0;
}
