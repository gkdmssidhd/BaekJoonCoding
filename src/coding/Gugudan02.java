package coding;

public class Gugudan02 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 8; i += 3) {
			for(int k = 1; k <= 9; k += 1) {
				for(int h = i; h <= (i + 2); h += 1) {
					System.out.print(h + "x" + k +"\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
