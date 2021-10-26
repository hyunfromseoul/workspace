import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[6];
		
		for (String string : names) {
			System.out.println("이름을 입력하세요");
			string = sc.next();
		}
		System.out.println(Arrays.toString(names));
		
		other: for (int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요");
//			names[i] = sc.next();
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("멈춰");
				break other;
			}
			names[i] = name;
		}
		System.out.println(Arrays.toString(names));
		
		for (String n : names) {
			if(n == null) break;
			System.out.println(n + " ");
		}
		
		sc.close();
	}

}
