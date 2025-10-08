import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {2,5,8,9,10,11,123,1,0};
        int start=0,end=arr.length-1;
        while(start<end){
        	int temp=arr[start];
        	arr[start]=arr[end];
        	arr[end]=temp;
        	start++;
        	end--;
        }
        	
        System.out.println("The reversed string is:" + Arrays.toString(arr));
        
        
        for(int i=arr.length-1;i>=0;i--){
        	System.out.print(Arrays.toString(arr));
        	break;
        }
}
}  