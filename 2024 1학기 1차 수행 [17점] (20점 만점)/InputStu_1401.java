//1401 �����
import java.util.Scanner;
public class InputStu_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("�� : ");
		int room = sc.nextInt();
		System.out.print("�а��� : ");
		String grade_name = sc.next();
		System.out.println(grade_name+"���� �������� "+name+"��(��) "+grade+"�г� "+room+"���Դϴ�.");
	}
}