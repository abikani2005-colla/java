class Ratrix {
	static int packets(int r,int unit,int arr[]){
		int foodNeed = r*unit;
		int start=0;
		int used=0;
		for(int f : arr){
			start+=f;
			used++;
			if(start>=foodNeed) {
				return used;
				
			}
		}
		return -1;
	}



	public static void main(String[] args) {
		
		int r=7;
		int unit=2;
		int used[]={2,8,3,5,6,7,8,2};
		int result= packets(r,unit,used);
		System.out.println("Packets needed:" +result);
	}

}
