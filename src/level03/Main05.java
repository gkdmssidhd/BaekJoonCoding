package level03;

import java.util.Scanner;

public class Main05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt();
		
		for(int i = 1; i<=c; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
				if(A>0 && B<10) {
				System.out.println("Case #" + i + ":" + (A+B));
			}
		}
		System.out.println("종료");
		scan.close();
	}
}
