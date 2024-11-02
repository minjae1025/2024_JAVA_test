//1401 梯團營
import java.util.Scanner;
public class OpCode_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("X 高  : ");
		int x = sc.nextInt();
		System.out.print("Y 高  : ");
		int y = sc.nextInt();
		System.out.print("м = "+(x+y));
		System.out.print("  離 = "+((x>y)? x-y : y-x));
		System.out.print("  培 = "+(x*y));
		System.out.print("  釭該雖 = "+((x>y)? x%y : y%x));
		System.out.print("  跟 = "+((x>y)? x/y : y/x));
	}
}