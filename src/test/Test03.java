package test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n, i, sum = 0;
		n = scan.nextInt();
		
		for(i = 1; i <= n; i++) 
			sum += i;
		
		System.out.printf("%d", sum);
	}
}
