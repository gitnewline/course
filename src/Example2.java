
class Square {
	double getSquare(int a) {
		return a*a;
	}
}

	

class Circle extends Square {
	double getSquare (int R){
		return 3.14 * R * R;
	}
		
}
class Triangle extends Square {
	double getSquare (int a) {
		return a*a/2.0;
	}
}

class Example2 {
	public static void main (String[] args) {
		Square s = new Square();
		Square s1 = new Circle();
		Square s2 = new Triangle();
		
		System.out.println(s.getSquare(5));
		System.out.println(s1.getSquare(5));
		System.out.println(s2.getSquare(5));
		
/*	 Square s [] = new Square[] {new Square(), new Circle(), new Triangle()	};
	 
	 for (int i = 0; i < s.length; i++) {
		 System.out.println(s[i].getSquare(5));*/
	 }
}
	

	