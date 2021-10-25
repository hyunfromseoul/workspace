import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num = sc.nextInt();
		
		int start = 1;
		
		int count = 0;
		
		while(start <= num) {
			count = num%start==0 ? count+=1 : count ;
			
			start++;
		}
		System.out.println(count);
		System.out.println(count == 2 ? num + "은 소수입니다." : num + "은 소수가 아닙니다");
	}

}
