
public class ForQuiz01 {

	public static void main(String[] args) {
			int a = (int) (Math.random() * 17) + 2;
		for (int i = 1; i < 19; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a*i);
		}
	}

}

