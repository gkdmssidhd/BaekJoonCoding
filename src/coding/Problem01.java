package coding;

public class Problem01 {
	
	public static void main(String[] args) {
		
		int a = 12, b = 8, c = 2, d = 3;
		
		// 연산자의 우선순위에 맞게 괄호로 묶은 다음 계산 하기
		// a = a / (b++ -(c*d))
		// 12/(8-(2*3))
		// b++는 후치 연산이므로 연산에 참여한 후 1을 증가시킨다.
		a /= b++ - c * d;
		
		System.out.printf("%d\n", a);
	}
}
