import java.util.Scanner;

public class Paging {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 게시물 수: ");
		int all = sc.nextInt();
		
		int n = 10;
		System.out.println("페이지당 게시글 수: " + n);
		 
		if (all % n == 0) {
			System.out.println("총 페이지: " + all / n);
		} else {
			System.out.println("총 페이지: " + (all / n + 1));
		}
		
	}

}