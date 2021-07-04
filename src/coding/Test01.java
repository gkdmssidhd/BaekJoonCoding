package coding;

public class Test01 {

	public static void main(String[] args) {
		
		int x = 1;
		
		System.out.println(!(x > 0));		// !(논리 not)는 결과의 부정 결과가 true면 false 반환
		System.out.println(x > 0 || x < 4);
		System.out.println(x << 2);			// 왼쪽 시프트 연산자 x에 저장된 값 1을 왼쪽으로 2비트 이동
		System.out.println(x & 2);			// 두 비트가 모두 1일때만 1이 되는 비트 연산자. x의 값 1과 2를 & 연산
		System.out.println(x % 3);			// 1을 3으로 나눈 나머진 1을 출력
	}
}
