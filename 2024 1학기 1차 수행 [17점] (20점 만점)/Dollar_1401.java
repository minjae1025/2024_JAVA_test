//1401 김민재
import java.util.Scanner;
public class Dollar_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원화를 입력하세요.(단위:원)  : ");
		int won = sc.nextInt();
		final int dollar = 1352;
		double to_dollar = (double)won / (double)dollar;
		System.out.println();
		System.out.printf("%d원은 $%.3f로 환전됩니다.", won, to_dollar);
	}
}