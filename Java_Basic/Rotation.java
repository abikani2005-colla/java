import java.util.Arrays;
import java.util.Scanner;
public class Rotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number of array elements:");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int k;
		System.out.println("Enter number of Left rotations:");
		k=sc.nextInt();
		
		int temp[] = new int[n];
		for(int i=0; i<n ; i++){
			
			temp[i]=arr[(i+k)%n];
			
			//System.out.println(Arrays.toString(arr));
		}
		for(int i=0;i<n;i++){
			arr[i]=temp[i];
		}
		System.out.println("Array after left rotation:" +Arrays.toString(arr));
	       int temp1[]= new int[n];
		for(int i=0;i<n;i++){
			
			temp1[i]=arr[(i-k+n)%n];
		}
		for(int i=0;i<n;i++){
			
			arr[i]=temp1[i];
		}
		System.out.println("Array:" +Arrays.toString(arr));
	}

}
