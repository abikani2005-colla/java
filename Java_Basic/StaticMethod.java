import java.util.Scanner;
 class Student {
	static int id;
	static String name;
	
	static void display(){
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
	}
	
}
public class StaticMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        
        System.out.println("enter id:");
        Student.id=sc.nextInt();
        System.out.println("enter name:");
        Student.name=sc.next();
        
        Student.display();
	}
}