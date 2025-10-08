import java.util.Scanner;
class methods1 {
	public void sub(int x,int y){
	
		System.out.println("Subtraction:" +(x-y));
}
	
}
public class WithArgAndWithoutReturn {

	public static void main(String[] args) {
		methods1 s=new methods1();
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		s.sub(a,b);

	}

}
