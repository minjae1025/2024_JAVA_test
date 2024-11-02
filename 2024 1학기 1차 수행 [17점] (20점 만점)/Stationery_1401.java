//1401 김민재
import java.util.Scanner;
public class Stationery_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구입한 문구류의 갯수를 입력하세요.");
		System.out.print("지우개 연필 볼펜 자 : ");
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
		System.out.println("총 지불금액은 "+total+"원입니다.");
		System.out.println();
		System.out.print("지급 금액 : ");
		int money = sc.nextInt();
		if (money - total < 0)
			System.out.println(money+"원을 받아 금액이 부족합니다.");
		else
		System.out.println(money+"원을 받아 거스름돈은 "+(money-total)+"원입니다.");
	}
}