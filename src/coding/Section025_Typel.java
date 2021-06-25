package coding;

import java.util.Scanner;

public class Section025_Typel {

	// 10개의 수치 자료를 입력 받아 배열에 저장한 후 저장된 자료 중 가장 큰 값을 찾는 순서도를 작성.
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		int a [] = new int[10];
		// 배열의 위치가 0부터 시작하므로 배열 a의 첨자 j는 j++을 수행 한 후 0이 되도록 -1로 초기화
		int j = -1, max = 0;		
		
		do {
			j++;
			a[j] = scan.nextInt();
			
			if(a[j] <=100) {
			} else {
				System.out.println("100이하의 수를 입력해 주세요.");
			}

		} while(j < 9);
			
			for(i = 0; i <=9; i++) 
			{	
				if(a[i] > max)max = a[i];
			
			}
			System.out.printf("%d", max);
			scan.close();
			
	
	}
}