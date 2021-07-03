package coding;

import java.util.Scanner;

public class Section027 {

	static final int FIND = 7;
	
	public static void main(String[] args) {
		
		Scanner scanf = new Scanner(System.in);
		int i, j, k, L, m = 0;
		
		int a[] = new int[10];
		i = -1;
		do {
			i++;
			a[i] = scanf.nextInt();
		} while(i < 9); 
			j = 9;
			for(k = 0; k <=9; k++) {
				if(a[k] >= FIND)
					L = a[k] - FIND;
				else
					L = FIND - a[k];
				if(L <= j) {
					j = L;
					m = a[k];
				}
			}
			System.out.printf("%d", m);
			scanf.close();
	}
}
