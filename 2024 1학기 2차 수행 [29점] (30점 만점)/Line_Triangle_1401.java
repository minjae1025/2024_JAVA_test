//1401 김민재
import java.util.Scanner;

public class Line_Triangle_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요. : ");
		int heigth = sc.nextInt();
		int num = heigth;
		int temp = num*num;
		for (int i = 0; i<heigth; i++) { 
			for (int j = temp; j>= 0; j-=num) {
				System.out.printf("%2d ", j);
			}
			System.out.println();
			num -= 1;
			temp = num*num;
		}
		System.out.printf("%2d", 0);
	}	
}