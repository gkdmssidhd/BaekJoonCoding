package test;

public class Test {

	public static void main(String[] args) {
		
		int a[] = new int[8];
		int d = 11, n = 0;
		
		do {
			a[n++] = d % 2;
			d /= 2;
		} while(d > 0);
		
		for (n = 7; n >= 0; n--)
			System.out.printf("%d", a[n]);
	}
}
