#include<iostream>
#include<math.h>
using namespace std;
main()
{
  long int x=0,i=2,y;
  while(x<10001)
  {
    y=0;
    for(long int j=2;j<(i);j++)
    {
      if(i%j==0)
      {
        y++;
        break;
      }
    }
    if(y==0)
    {
      x++;
    }
    i++;
  }
  cout<<i-1;
}
