

public class countOddEven {

	public static void main(String[] args) {
		int arr[]={6,5,7,2,0};
	    int even=0,odd=0;
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				even++;
				
			}	
			else{
				odd++;	
			
		}
		
		

	}
		System.out.println("Count even:" +even);
		System.out.println("Count even:" +odd);

	}
}
