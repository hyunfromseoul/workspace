import java.util.Scanner;

public class BreakExample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = (int)(Math.random()*100+1);
		System.out.println(answer);
		other: for (int i = 0; i < 7; i++) {
				System.out.println("1~100 사이의 정수를 입력하세요.");
				System.out.print(">");
				int a = sc.nextInt();
				System.out.println("입력한 값은 :"+a);
				System.out.println(a < answer ? "UP" : "DOWN");
				if (a == answer) {
					System.out.println("정답");
					break other;					
				} else {
					System.out.println("답이 틀렸습니다.");
				}
				
				System.out.print(i==6 ? "\n7번의 기회를 모두 사용하셨습니다." : "");
				
			}
			
		}
		
		
		
}


