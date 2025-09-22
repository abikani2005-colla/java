#include<stdio.h>
#include<string.h>
int main ()
{
char a;
printf("enter the letter");
scanf("%d",&a);
int b=a;
if(a>=65 && a<=90)
{
    printf("it is capital letter");
}
else if(a>=97 && a<=122)
{
    printf("it is small letter");
}

    else if(a>=48 && a<=57)
{
    printf("it is number") ;
}
else{
    printf("it is special character");
}
return 0;
}