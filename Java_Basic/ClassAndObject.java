import java.util.Scanner;
class Student {
	int id;
	String name;
	
	void display(){
		System.out.println("ID:" +id);
		System.out.println("Name:" +name);
	}
	
}
public class ClassAndObject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        Student ram=new Student();
        System.out.println("enter id:");
        ram.id=sc.nextInt();
        System.out.println("enter name:");
        ram.name=sc.next();
        //ram.id=108;
        //ram.name="Ram";
        ram.display();
	}

}
