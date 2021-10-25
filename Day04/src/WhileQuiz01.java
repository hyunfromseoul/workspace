import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		// 구구단 단수 입력받아 구구단 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단을 입력하세요: ");
		int num = sc.nextInt();
		int loop = 1;
		System.out.println("***** "+ num + "단 *****");
		while(loop <= 9) {
//			System.out.println(num + " x " + loop + " = " + num * loop);
			System.out.printf("%d x %d = %d\n", num, loop, num*loop);
			loop++;
			
		}
		sc.close();
	}

}
