//1401 �����
import java.util.Scanner;
public class Number_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ÿ �Է� : ");
		int input = sc.nextInt();
		System.out.println();
		int num1000 = input/1000;
		int num100 = ((input%1000)-(input%100))/100;
		int num10 = ((input%100)-(input%10))/10;
		System.out.println("1000�� �ڸ� = "+num1000);
		System.out.println("100�� �ڸ� = "+num100);
		System.out.println("10�� �ڸ� = "+num10);
		System.out.println("1�� �ڸ� = "+(input%10));

	}
}