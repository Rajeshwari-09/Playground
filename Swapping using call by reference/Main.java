#include <stdio.h>
int main()
{
  int a, b;
  scanf("%d %d", &a, &b);
  printf("Before swapping a= %d and b=%d",a,b);
  a = a ^ b;
  b = a ^ b;
  a = a ^ b;
  printf("\nAfter swapping a= %d and b=%d",a,b);
}