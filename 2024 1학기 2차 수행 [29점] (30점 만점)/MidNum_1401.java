//1401 �����
import java.util.Scanner;

public class MidNum_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.print("5���� ������ �Է��ϼ���. : ");
		for (int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		System.out.print("�Էµ���Ÿ : ");
		for (int i = 0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int mid_num = MidNum(num);
		System.out.println("�߰��� : "+mid_num);
	}
	static int MidNum(int num[]) {
		int temp = 0;
		for(int i = 0; i < num.length-1; i++) {
    			for(int j = i; j < num.length; j++) {
        				if (num[i] > num[j]) {
            				temp = num[i];
            				num[i] = num[j];
            				num[j] = temp;
        				}
    			}
		}
		return num[2];
	}
}