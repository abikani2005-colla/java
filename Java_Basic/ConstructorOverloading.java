class Box1 {
	float length , breadth;
	Box1(){
		length=2;
		breadth=5;
	}
	Box1(float x, float y){
		length = x;
		breadth = y;
	}
	Box1(float x){
		length =breadth = x;
	}
	float area(){
		return length*breadth;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Box1 s=new Box1();
		System.out.println("Area:" +s.area());
		Box1 s1=new Box1(3,5);
		System.out.println("Area:" +s1.area());
		Box1 s2=new Box1(5);
		System.out.println("Area:" +s2.area());
		

	}

}
