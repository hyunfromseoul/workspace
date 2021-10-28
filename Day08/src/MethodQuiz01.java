
public class MethodQuiz01 {
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2 (String input) {
		return input;
	}
	
	static double[] method3(int a, int b, double c) {
		return new double[] {a + b + c};
	}
	
	static String method4(int a) {
		if (a%2==0) {
			return "짝수~";
		} else if (a % 2 != 0) {
			return "홀수~";
		} else {
			return "몰러~";
		}
	}
	
	static void method5 (String a, int b) {
		for (int i = 1; i <= b; i++) {
			System.out.println(a);
		}
	}
	
	static int maxNum (int a, int b) {
		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}
	}
	
	static int abs (int a) {
		return Math.abs(a);
	}
	
	static int method6(int b) {
		int total = 0;
		for (int i = 0; i <= b; i++) {
			total += i;
		}
		
		return total;
	}
	
	static int method7(int[] arr) {
		return arr.length;
	}
	
	static String[] method8(String a, String b) {
		return new String[] { a , b };
	}
	
	static String java (int i) {
		String empty = "";
		for (int j = 0; j <= i; j++) {
			if (j % 2 == 0 && j != 0) {
				empty+="바";
			} else if (j % 2 != 0) {
				empty+="자";
			} 
		}
		return empty;
	}
	
	public static void main(String[] args) {
		String str = java(9);
		System.out.println(str);
		
		method1();
	
		System.out.println(method2("하세요"));
		
		for (double g : method3(1,2,3)) {
			System.out.println("3개의 합은?");
			System.out.println("> "+g);
		}
		
		System.out.println(method4(4));
		
		method5("예아",5);
		
		System.out.println(maxNum(3,5));
		
		abs(-5);
		
		System.out.println(method6(10));
		
		int[] arrHere = new int[12];
		System.out.println(method7(arrHere));
		
		System.out.println(method8("무야호", "호야무")[0]);
		System.out.println(method8("무야호", "호야무")[1]);
		
		
	}

}
