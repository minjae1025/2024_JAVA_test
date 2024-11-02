//1401 김민재
import java.util.Scanner;

public class Number_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[101]; //단, n은 100개 이하라고 한다.
		int num = 0;
		int sum = 0;
		int i = 0;
		int cnt = 0;
		while (true) {
			System.out.print("수 입력 : ");
			num = sc.nextInt();
			if (num <= 30 && num >= 10) {
				n[i++]=num;
				cnt++;
			}
			if (num == 0) {
				break;
			}
		}
		System.out.print("10 ~ 30 사이의 수 : ");
		for (i = 0; i<cnt; i++) {
			if (n[i] > 0) {
				System.out.print(n[i]+" ");
				sum += n[i];
			}
		}
		System.out.println();
		System.out.println("총합  : "+sum);
	}
}