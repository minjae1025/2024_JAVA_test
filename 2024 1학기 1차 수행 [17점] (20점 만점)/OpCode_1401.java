//1401 �����
import java.util.Scanner;
public class OpCode_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X ��  : ");
		int x = sc.nextInt();
		System.out.print("Y ��  : ");
		int y = sc.nextInt();
		System.out.print("�� = "+(x+y));
		System.out.print("  �� = "+((x>y)? x-y : y-x));
		System.out.print("  �� = "+(x*y));
		System.out.print("  ������ = "+((x>y)? x%y : y%x));
		System.out.print("  �� = "+((x>y)? x/y : y/x));
	}
}