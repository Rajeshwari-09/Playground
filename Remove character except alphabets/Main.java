#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char input[200];
    int i, j;
    cin >> input;
    for(i = 0; input[i] != '\0'; ++i)
    {
        while (!( (input[i] >= 'a' && input[i] <= 'z') || (input[i] >= 'A' && input[i] <= 'Z') || input[i] == '\0') )
        {
            for(j = i; input[j] != '\0'; ++j)
            {
                input[j] = input[j+1];
            }
            input[j] = '\0';
        }
    }
    cout<<input;
}