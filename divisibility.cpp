#include<iostream>
#include<stdlib.h>
using namespace std;
main()
{
  long int i=150;//here i took 150 as initial number to be verified loop starts with this number
  int x=0;
  while(1)
  {
      x=0;
    for(int j=1;j<=20;j++)
    {
      if(i%j==0)
      {
        x++;
      }
      else
      {
        break;
      }
    }
    if(x==20)
    {
      cout<<i;
      exit(1);
    }
      i++;
  }
}
