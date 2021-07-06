package coding;

public class Gugudan03 {

	public static void main(String[] args) {
		
		// 한 줄에 출력할 단의 개수 
		int cnt = 3;
		
		for(int i=0; i<2; i++) {
			for(int y=1; y<=9; y++) {
				for(int x = 2+cnt*i; x <= 5+cnt*i; x++) {
					System.out.printf("%d * %d = %d\t", x, y, x*y);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
