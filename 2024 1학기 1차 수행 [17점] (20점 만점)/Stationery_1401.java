//1401 �����
import java.util.Scanner;
public class Stationery_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �������� ������ �Է��ϼ���.");
		System.out.print("���찳 ���� ���� �� : ");
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		int input3 = sc.nextInt();
		int input4 = sc.nextInt();
		final int erasr = 800;
		final int tree_pen = 1200;
		final int pen = 1560;
		final int roller = 950;
		int total = (erasr*input1)+(tree_pen*input2)+(pen*input3)+(roller*input4);
		System.out.println();
		System.out.println("�� ���ұݾ��� "+total+"���Դϴ�.");
		System.out.println();
		System.out.print("���� �ݾ� : ");
		int money = sc.nextInt();
		if (money - total < 0)
			System.out.println(money+"���� �޾� �ݾ��� �����մϴ�.");
		else
		System.out.println(money+"���� �޾� �Ž������� "+(money-total)+"���Դϴ�.");
	}
}