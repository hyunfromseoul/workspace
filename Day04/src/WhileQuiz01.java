import java.util.Scanner;

public class WhileQuiz01 {

	public static void main(String[] args) {
		// ������ �ܼ� �Է¹޾� ������ ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ���: ");
		int num = sc.nextInt();
		int loop = 1;
		System.out.println("***** "+ num + "�� *****");
		while(loop <= 9) {
//			System.out.println(num + " x " + loop + " = " + num * loop);
			System.out.printf("%d x %d = %d\n", num, loop, num*loop);
			loop++;
			
		}
		sc.close();
	}

}
