//1401 �����
import java.util.Scanner;
public class Dollar_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���.(����:��)  : ");
		int won = sc.nextInt();
		final int dollar = 1352;
		double to_dollar = (double)won / (double)dollar;
		System.out.println();
		System.out.printf("%d���� $%.3f�� ȯ���˴ϴ�.", won, to_dollar);
	}
}