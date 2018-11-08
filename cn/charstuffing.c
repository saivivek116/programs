#include<stdio.h>
#include<string.h>
void stuffing(char [],char [],int);
void destuffing(char [],int);
void main()
{
    char a[50],b[50];
    int i,n;
    printf("Enter the string");
    gets(a);
    n=strlen(a);
    stuffing(a,b,n);
}
void stuffing(char a[],char b[],int n)
{
    char c[50];
    int i,j=4,k=0,x=0;
    char flag[4]="flag";
    //char esc[3]="esc";
    for(i=0;i<4;i++)
    {
        b[i]=flag[i];
    }
    for(i=0;i<n;i++)
    {
        if((a[i]=='f'&&a[i+1]=='l'&&a[i+2]=='a'&&a[i+3]=='g')||(a[i]=='e'&&a[i+1]=='s'&&a[i+2]=='c'))
        {
            b[j++]='e';
            b[j++]='s';
            b[j++]='c';
        }
        b[j++]=a[i];
    }
    for(i=j;i<j+4;i++,x++)
    {
        b[i]=flag[x];
    }
    for(i=0;i<j+4;i++)
    {
        c[i]=b[i];
        printf("%c",b[i]);
    }
    c[i]='\0';
    destuffing(c,j);
 }
 void destuffing(char b[],int j)   
 {
    char destuff[50],k=0;
    for(int i=4;i<j;i++,k++)
    {
        if(b[i]=='e'&&b[i+1]=='s'&&b[i+2]=='c')
            i+=3;
        destuff[k]=b[i];
    }
    destuff[k]='\0';
    
    printf("destuffed message is %s",destuff);
 }        
