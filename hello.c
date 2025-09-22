#include<stdio.h>
int main()
{
int n;
scanf("&d",&n);
int arr[n];
for(int i=0;i<=n-i;i++){
  scanf("&d",&arr[i]);

}
int element ,firstoccurence=-1,lastoocurenece=-1;
scanf("%d",&element);
for(int i=0;i<=n-1;i++){
  if(arr[i]==element){
    firstoccurence;
    break;

  }
}
for(int i=0;i<=n-1;i++){
  if (arr[i]==element){
    lastoccurence=i;
  }
}
print("first occurence %d",firstoccurence);
printf("last occurence %d",lastoccurence);
return 0;
}