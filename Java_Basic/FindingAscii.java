public class FindingAscii {

	public static void main(String[] args) {
		String str="NiNthish";
		int ascii=78;
		boolean ch=false;
		for(int i=0;i<str.length();i++){
			
			if((int)str.charAt(i)==ascii){
				System.out.println("Character found:" +str.charAt(i) + " - " + i);
			     ch=true;
			     
			}
			
		}
		if(!ch){
			System.out.println("not found");
		}
               
	}

}
