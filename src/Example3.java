
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		MyClass1 a = new MyClass1();
		a.a = 55;
		
		MyClass1 b = new MyClass1();
		System.out.println(b.a);
	}
}

class MyClass1 {
	static int a;
	final double b = 11.5;
}