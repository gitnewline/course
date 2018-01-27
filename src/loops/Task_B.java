package loops;

import java.util.Scanner;

public class Task_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int i, a, b, c, d;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		d = scan.nextInt();
		
		for (i = a; i <= b; i++) {
			if (a % d == c) {
				System.out.print(a +" ");
			}
		}
		
		
	}

}
