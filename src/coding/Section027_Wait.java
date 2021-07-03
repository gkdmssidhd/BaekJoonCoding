package coding;

public class Section027_Wait {

	public static void main(String[] args) {
		int m, n, x, s = 0;
		
		// 10개의 요소를 갖는 배열 k에 값이 저장되어 있다고 가정하였으므로 값을 초기화.
		int k[] = {1,2,3,4,7,6,8,9,3,6};
		
		m = 9;
		n = -1; // 배열의 위치가 0부터 시작하므로 배열 k의 첨자 n은 밑에 'n++'을 수행한 후 0이 되도록 -1로 초기화
		  do {
			  n++;
			  if(k[n] < 5)
				  x = 5 - k[n]; // 수행 후 제어가 if(m > x)로 이동
			  else
				  x = k[n] - 5; // 수행 후 제어가 if(m > x)로 이동
			  if(m > x) {
				  m = x;
				  s = k[n]; 	// 수행 후 제어가 do~while 문의 시작점으로 이동하여 다시 시작.
			  }
		  } while(n < 9); 		// 배열의 위치가 0부터 시작하므로 배열 k의 첨자 n은 0~9까지 10자리가 된다.
		  
		  System.out.printf("%d", s);
	}
}
