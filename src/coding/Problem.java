package coding;

public class Problem {
	public static void main(String[] args) {
		
		int i, j = 0;
		// 반복 변수 i가 0에서 시작하여 1씩 증가하면서 8보다 작은 동안 1번을 8회 반복 수행한다.
		for (i = 0; i < 8; i++) { 
			// 1번 부분 / j = j + i; 동일 i의 값을 j에 누적시킨다.
			j += i;
		}
		System.out.printf("%d, %d\n", i, j);
	}
}
