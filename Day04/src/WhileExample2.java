
public class WhileExample2 {

	public static void main(String[] args) {
		int a = 1;
		while( a < 100) {
			System.out.print(a%4==0 && a%8!=0 ? a+" " : "");
			a++;
		}
		
//		1~30000������ ������ 258�� ����� ������ ���
		int result = 0;
		while(a < 30000) {
			if(a%258==0) result++;
			
			a++;
		}
		System.out.println();
		System.out.println(result);
//	1000�� ����� ������ ���ϼ���
		
		int k = 1;
		int cnt = 0;
		while(k <= 1000) {
			if(1000 % k == 0) {
				cnt++;
			}
			k++;
		}
		System.out.printf("1000�� ��� ����: %d��\n", cnt);
	}
	
	 
}
