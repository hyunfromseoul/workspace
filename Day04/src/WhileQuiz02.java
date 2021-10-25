import java.util.Scanner;

public class WhileQuiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 1;
		
		int a = sc.nextInt();
		
		int count = 0;
		while(start <= a) {
			
			if(a%start==0) {
				count+=start;
			}
			
			start++;
		}
		
		System.out.println("약수의 총합은 "+count+"입니다.");
		
	}

}
