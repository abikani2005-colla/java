import java.util.Scanner;
public class CashierProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int amount ,hun,fif,ten;
        System.out.println("Enter total amount:");
        amount=s.nextInt();
        hun=amount/100;
        System.out.println("Number of hundreds:" +hun);
        int rem=amount%100;
        fif=rem/50;
        System.out.println("Number of fifties:" +fif);
        int dum = rem%50;
        ten=dum/10;
        System.out.println("Number of tens:" +ten);
        int vim=dum%10;
        System.out.println("Remaining:" +vim);
	}

}
