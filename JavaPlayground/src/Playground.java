import java.util.Scanner;

public class Playground {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է����ּ���. (ex: 8,7)");
		System.out.print(">");
		String inputValue = sc.nextLine();
		
		//8,7 �Է¹���
		System.out.println(inputValue);
		
		// ,�� ������ 8�� 7�� ��Ʈ�� �迭�� ����
		String[] splitedValue =inputValue.split(",");
		int[] arr = new int[2];
		//forEach�� string �ȿ� �ְ� ���
		for (int i = 0; i < splitedValue.length; i++) {
			arr[i] = Integer.parseInt(splitedValue[i]);
		}
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (int i = 2; i <= arr[0]; i++) {
			for (int j = 1; j <= arr[1]; j++) {
				System.out.printf("%d * %d = %d ", i, j, i*j);
			}
			System.out.println();
		}
	}

}
