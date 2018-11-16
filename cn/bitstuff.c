#include<stdio.h>
#include<stdlib.h>
main()
{
    char *p,*q;
    char in[100];
    char stuff[100];
    char destuff[100];
    int count=0;
    printf("Enter the input string:");
    scanf("%s",in);
    p=in;q=stuff;
    while(*p!='\0')
    {
        if(*p=='0')
        {
            *q=*p;
            q++;
            p++;
         }
         else
         {
            while(*p=='1'&&count!=5)
            {
                count++;
                *q=*p;
                q++;
                p++;
            }
            if(count==5)
            {
                *q='0';
                 q++;
            }
            count=0;
         }
     }
     *q='\0';
     printf("the stuffed string is \n %s",stuff);
     p=stuff;
     q=destuff;
     while(*p!='\0')
     {
        if(*p=='0')
        {
            *q=*p;
            q++;
            p++;
         }
         else
         {
            while(*p=='1'&&count!=5)
            {
                count++;
                *q=*p;
                q++;
                p++;
            }
            if(count==5)
            {
                p++;
            }
            count=0;
          }
       }
       *q='\0';
       printf("THe destuffed string is \n %s",destuff);
   }
             
