import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����, ����, �� �߿� �ϳ��� �Է��ϼ���.");
		String choice = sc.next();
		
		int random = (int)(Math.random() * 3 + 1);
		
		System.out.print((choice == "����" && random == 1) ? "�����ϴ�": "");
		System.out.print((choice == "����" && random == 2) ? "�����ϴ�": "");
		System.out.print((choice == "��" && random == 3) ? "�����ϴ�": "");

		System.out.print((choice == "����" && random == 3) ? "�̰���ϴ�": "");
		System.out.print((choice == "����" && random == 1) ? "�̰���ϴ�": "");
		System.out.print((choice == "��" && random == 2) ? "�̰���ϴ�": "");
		
		System.out.print((choice == "����" && random == 2) ? "�����ϴ�": "");
		System.out.print((choice == "����" && random == 3) ? "�����ϴ�": "");
		System.out.print((choice == "��" && random == 1) ? "�����ϴ�": "");
		 
		System.out.println(random);
	}

}
