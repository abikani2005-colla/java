import java.util.Scanner;
public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the number of array elements:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("The" +n+ " Elements are:");
		for(i=0;i<=arr.length-1;i++){
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(i=0;i<=arr.length-1;i++){
			
			
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
			
		}
		System.out.println("the max value is:" +max);
		System.out.println("the min value is:" +min);
	}

}
