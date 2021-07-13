package method;

public class HiMathTest {

	public static void main(String[] args) {
		
		HiMath hm = new HiMath();
		int cat = hm.add(3, 3);
		int dog = hm.subtract(3, 3);
		int fish = hm.multiply(3, 3);
		int tiger = hm.divide(3, 3);
		
		System.out.println("cat = " + cat);
		System.out.println("dog = " + dog);
		System.out.println("fish = " + fish);
		System.out.println("tiger = " + tiger);
		
	}
}
