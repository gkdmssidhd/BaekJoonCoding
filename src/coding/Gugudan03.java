package coding;

public class Gugudan03 {

	public static void main(String[] args) {
	
		// 제일앞에 2단부터 5단 8단까지 찍어 내기
		for(int i = 2; i <= 8; i += 3) {
			
			// 뒤에 1부터 9까지 곱해질 숫자
			for(int k = 1; k <= 9; k+=1) {
				
				// 2부터 3,4 5부터 6,7 8부터 9,10 뽑으려고
				// 처음 2가 와서 2<=4 -> 2+1 = 3
				// 다음 3가 와서 3<=5 -> 3+1 = 4
				// 다음 4가 와서 4<=6 -> 4+1 = 5
				// 5,6,7,8,9,10 도 이런식으로
				for(int h = i; h <= (i+2); h += 1) {
					System.out.print(h + "x" + k +"\t");
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}
