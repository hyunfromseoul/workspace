import java.util.Iterator;
import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		for(int i=1; i<=200; i++) {
			if(i%6==0 && i%12!=0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		int temp = 0;
		for(int i=1; i<=60000; i++) {
			if(i%177==0) {
				temp++;
			}
		}
		
		System.out.println(temp);
		
		System.out.println("정수 입력: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int tmp = 1;
		for (int i=a; i>=1; i--) {
			tmp *= i;
			
		}
		
		System.out.println(tmp);
		
		sc.close();
	}
	
	

}
