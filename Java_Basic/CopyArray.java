import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		int[] a={1,2,4,8,5};
		int[] copy=new int[a.length];
		
		for(int i=0;i<a.length;i++){
			
			copy[i]=a[i];
		}
           System.out.println("Copied array:" + Arrays.toString(copy));
	}

}
