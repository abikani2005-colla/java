public class numAndTarget {

	public static void main(String[] args) {
		int nums[]={3,2,6,2};
		int target=5;
		
		for(int i=0;i<nums.length; i++){
			
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]+nums[j]==target){
					System.out.println("["+ i +"," + j +"]");
				}
			}
			
		}

	}

}
