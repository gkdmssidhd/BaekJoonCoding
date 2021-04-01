package level03;

import java.util.Scanner;

public class Main02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		
		scan.close();
		
		int sum = 0;
		for(int i = 1; i<=A; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
