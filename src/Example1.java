
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Naslednik a = new Naslednik();
       a.a = 55;
       int f = a.function1(20);
       System.out.println(f);
       a.function();
       
       }
}

class MyClass {
	int a;
	private double b;
	char c;
	
	int function1(int x) {
		return x*x;
	}
	
}
class Naslednik extends MyClass {
	
	void function() {
		System.out.println(a);
	}
}
