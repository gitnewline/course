package loops;

import java.util.Scanner;

public class Task_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 0, b;
		
		System.out.print("A = ");
		a = sc.nextInt();
		System.out.print("B = ");
		b = sc.nextInt();
		
		for(int i = a; i <= b; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
