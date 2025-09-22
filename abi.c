#include<stdio.h>
int main()
{
    int arr[]={24,15,17,12,28};
     printf("%d",arr[0]);
     printf("%d",arr[2]);
     printf("%d",arr[4]);
     printf("%d",arr[6]);
    int a=20;
     printf("%d",sizeof(a));
     printf("%d",sizeof(arr));
    int length=sizeof(arr)/sizeof(arr[0]);
      printf("number of elements %d",length);
      printf("\n elements are");
      for(int i=0;i<=length-1;i++){
     printf("%d",arr[i]);
      }
    }
    
    