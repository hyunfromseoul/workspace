import java.util.Scanner;

public class WhileQuiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� x�� ���� �Է��ϼ���.");
		int x = sc.nextInt();
		System.out.println("���� y�� ���� �Է��ϼ���.");
		int y = sc.nextInt();
		
		int tmp = 0;
//		while(x<=y) {
//			tmp+=x;
//			x++;
//		}
//		System.out.println("����: " + tmp);
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
		System.out.println("����: " + tmp);
	}

}
