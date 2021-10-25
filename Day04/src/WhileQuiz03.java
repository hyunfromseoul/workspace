import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 x의 값을 입력하세요.");
		int x = sc.nextInt();
		System.out.println("정수 y의 값을 입력하세요.");
		int y = sc.nextInt();
		
		int tmp = 0;
//		while(x<=y) {
//			tmp+=x;
//			x++;
//		}
//		System.out.println("정답: " + tmp);
//		
		if ( x > y ) {
			int temp = x;
			x = y;
			y = temp;
		}
		
		while(x<=y) {
			tmp+=x;
			x++;
		}
		System.out.println("정답: " + tmp);
	}

}
