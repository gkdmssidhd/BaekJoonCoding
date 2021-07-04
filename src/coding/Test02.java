package coding;

// 1부터 100의 범위 안에서 가장 큰 소수를 구하는 알고리즘
public class Test02 {
	
	public static void main(String[] args) {
		
		int p = 2, n = 3;
		while(true) {
			double t = Math.sqrt(n);
			int m = (int)t;
			
			for(int i = 2; i <= m; i ++) {
				int r = n % i;
				if(r == 0) break;
				if(i == m) p = n;
			}
			n++;
			if(n > 100) break;
		}
		System.out.println(p);
	}
}
