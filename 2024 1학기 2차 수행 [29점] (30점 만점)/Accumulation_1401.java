//1401 ±è¹ÎÀç
import java.util.Scanner;

public class Accumulation_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("¼ö ÀÔ ·Â : ");
		int input = sc.nextInt();
		int num = 2;
		int temp = 1;
		do {
			int sum = temp+num;
			System.out.println(temp+"+"+num+"="+sum);
			temp = sum;
			num++;
		} while (num <= input);
	}
}