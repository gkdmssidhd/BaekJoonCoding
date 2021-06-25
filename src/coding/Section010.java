package coding;

public class Section010 {
	// 1+2+3+4+....+100 까지의 합계를 구하는 순서도
	public static void main(String[] args) {
		
		int  i, j;
		i = 0;
		j = 0;
		
		do {
			i ++;
			j += i;
		} while(i < 100);
		
		System.out.printf("%d %d", i , j);
	}
}
