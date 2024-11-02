//1401 김민재
import java.util.Scanner;

public class Exam_1401 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수 입력 : ");
		int stu_num = sc.nextInt();
		int[][] score = new int[stu_num][3];
		String[] name = new String[stu_num];
		double[] aver = new double[stu_num];
		int[] rank = new int[stu_num];
		for (int i = 0; i<stu_num; i++) {
			System.out.print("이름 : ");
			name[i] = sc.next();

			System.out.print("중간점수 : ");
			score[i][0] = sc.nextInt();

			System.out.print("기말점수 : ");
			score[i][1] = sc.nextInt();

			score[i][2] = score[i][0] + score[i][1];
			aver[i] = (double)score[i][2] / 2;
			
			rank[i] = 1;
			System.out.println();
		}
		for (int i = 0; i < stu_num-1; i++) {
    			for (int j = i; j < stu_num; j++) {                			
        				if (score[i][2] < score[j][2]) {
            				rank[i]++;
        				}
				else if (score[i][2] > score[j][2]) {
            				rank[j]++;
        				}
    			}
		}
		System.out.println("이름       중간  기말    평균   석차   12345678901234567890");
		
		for (int i = 0; i<stu_num; i++) {
			System.out.printf("%s\t%6d%6d%10.2f%5d    ", name[i], score[i][0], score[i][1], aver[i], rank[i]);
			for (int j = 0; j<(int)aver[i]/5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}