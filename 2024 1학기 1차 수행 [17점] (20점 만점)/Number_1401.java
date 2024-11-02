//1401 김민재
import java.util.Scanner;
public class Number_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이타 입력 : ");
		int input = sc.nextInt();
		System.out.println();
		int num1000 = input/1000;
		int num100 = ((input%1000)-(input%100))/100;
		int num10 = ((input%100)-(input%10))/10;
		System.out.println("1000의 자리 = "+num1000);
		System.out.println("100의 자리 = "+num100);
		System.out.println("10의 자리 = "+num10);
		System.out.println("1의 자리 = "+(input%10));

	}
}