#include <iostream>
using namespace std;
struct difference
{
int hour1, minute1, second1;
int hour2, minute2, second2;
};

int main() 
{
difference d;
int diff_hour, diff_minute, diff_second;
cin>>d.hour1>>d.minute1>>d.second1;
cin>>d.hour2>>d.minute2>>d.second2;   
if(d.second2 > d.second1) 
{
d.minute1--;
d.second1 += 60;
}   
diff_second = d.second1 - d.second2;   
if(d.minute2 > d.minute1) 
{
d.hour1--;
d.minute1 += 60;
}
diff_minute = d.minute1 - d.minute2;
diff_hour = d.hour1 - d.hour2;   
cout<<diff_hour<<":"<< diff_minute <<":"<<diff_second;  
return 0;
}