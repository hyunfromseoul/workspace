import java.util.Scanner;

public class Paging {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Խù� ��: ");
		int all = sc.nextInt();
		
		int n = 10;
		System.out.println("�������� �Խñ� ��: " + n);
		 
		if (all % n == 0) {
			System.out.println("�� ������: " + all / n);
		} else {
			System.out.println("�� ������: " + (all / n + 1));
		}
		
	}

}