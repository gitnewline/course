package loops;

import java.util.Scanner;

public class Task_M {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, b, counter = 0;
		
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			b = scan.nextInt();
			if (b == 0) {
				counter = counter + 1;
			}
		}
	/*	
		if (counter > 0) {
			System.out.println(" \"0\" - der sany: "+counter);
		} else {
			System.out.println("0 degen san jok");
		}
		*/
		
	}

}
