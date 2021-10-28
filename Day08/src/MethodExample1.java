
public class MethodExample1 {
	static int calcTotal(int x) {
		int total = 0;
		for (int i = 0; i <= x; i++) {
			total += i;
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		System.out.println(calcTotal(100));
		System.out.println(calcTotal(200));
		System.out.println(calcTotal(300));
	}

}
