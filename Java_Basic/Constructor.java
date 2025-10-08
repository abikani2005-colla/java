class Box {
	int l,bt;
	Box(int x,int y){
		l=x;
		bt=y;
	}
	int area(){
		return l*bt;
	}
}
public class Constructor {

	public static void main(String[] args) {
		Box s=new Box(20,10);
		
		System.out.println("Area of Rectangle:" +s.area());
	}

}
