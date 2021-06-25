package coding;

public class Section010_Wait {
	// 1+3+5+7....+99의 합계를 구하는 순서도
	public static void main(String[] args) {
		
		int i, j;
		i = -1;
		j = 0;
		
		// do는 무조건 실행하고 본다.
		do {
			i += 2;		// i = i+2 i의 값을 2씩 누적
			j += i;		// j = j+i i의 값을 j에 누적
		} while(i < 99);
		
		System.out.printf("%d", j);
	}
}
