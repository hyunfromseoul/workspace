import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100+1);
		System.out.println(answer);
		other: for (int i = 0; i < 7; i++) {
				System.out.println("1~100 ������ ������ �Է��ϼ���.");
				System.out.print(">");
				int a = sc.nextInt();
				System.out.println("�Է��� ���� :"+a);
				System.out.println(a < answer ? "UP" : "DOWN");
				if (a == answer) {
					System.out.println("����");
					break other;					
				} else {
					System.out.println("���� Ʋ�Ƚ��ϴ�.");
				}
				
				System.out.print(i==6 ? "\n7���� ��ȸ�� ��� ����ϼ̽��ϴ�." : "");
				
			}
			
		}
		
		
		
}


