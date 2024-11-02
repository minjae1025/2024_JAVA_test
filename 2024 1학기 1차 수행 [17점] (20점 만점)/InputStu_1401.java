//1401 김민재
import java.util.Scanner;
public class InputStu_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반 : ");
		int room = sc.nextInt();
		System.out.print("학과명 : ");
		String grade_name = sc.next();
		System.out.println(grade_name+"과에 재학중인 "+name+"은(는) "+grade+"학년 "+room+"반입니다.");
	}
}