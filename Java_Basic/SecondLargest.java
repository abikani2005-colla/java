
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int largest=0;
		int secondLargest=0;
		for(int i=0;i<n;i++){
			if(arr[i]>largest){
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=largest){
				secondLargest=arr[i];
			}
		}
		System.out.println("The Largest elemnet is:" +largest);
		System.out.println("The second largest elemnent iis :" +secondLargest);

	}

}
