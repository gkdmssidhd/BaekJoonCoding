package level03;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		scan.close();
		
		for(int i=A; i>0; i--) {
			System.out.println(i);
			A--;
		}
	}

}
