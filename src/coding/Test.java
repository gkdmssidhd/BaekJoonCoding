package coding;

public class Test {
	// 간단 구구단 2-9단
	public static void main(String[] args) {
		
		int i, j;
		
		for(i =2; i<=9; i++) {
			for(j =1; j<=9; j++) {

				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
}
