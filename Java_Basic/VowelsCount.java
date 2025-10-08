
public class VowelsCount {

	public static void main(String[] args) {
		String str="Apple";
		int vowels=0,consonant=0;
		for(int i=0;i<str.length();i++){
			char ch=Character.toLowerCase(str.charAt(i));
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				
				vowels++;
			}
			else{
				consonant++;
			}
		}
		
		System.out.println("Number of vowels:" +vowels);
		System.out.println("Number of Consonant:" +consonant);
	}

}
