package level03;

import java.util.Scanner;

public class Main01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 스캐너를 통해 정수로 입력해서 담겨질 c
		int c = scan.nextInt();
		// 배열 선언 c
		int arr[] = new int[c];
		
		for (int i = 0; i <c ; i ++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			arr[i] = A + B;
		}
		scan.close();
		
		// 배열 k에 담아서 출력
		for(int k : arr) {
			System.out.println(k);
		}
	}
}
