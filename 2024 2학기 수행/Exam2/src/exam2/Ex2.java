package exam2;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 부채꼴의 갯수를 입력하시오. : ");
		int num = sc.nextInt();
		Rectangle[] rec = new Rectangle[num];
		for (int i = 0; i<num; i++) {
			System.out.println((i+1)+"번 부채꼴");
			System.out.print("반지름 입력 : ");
			// ban = ;
			rec[i] = new Rectangle(sc.nextDouble());
		}
		
		for (int i = 0; i<num; i++) {
			System.out.println(rec[i].toString());
		}
		
	}

}

class Rectangle {
	private double ban;
	private double area;
	private double round;
	
	public Rectangle(double ban) {
		this.ban = ban;
		areaCel();
		roundCel();
	}
	
	void areaCel() {
		area = ban*ban*Math.PI/4; //(ban / 4 * Math.PI) * (ban / 4 * Math.PI) /2 ;
	}
	
	void roundCel() {
		round = ban + ban + (ban* Math.PI) / 4;
	}
	
	@Override
	public String toString() {
		return ("반지름 "+ban+"인 부채꼴의 면적 : "+area+", 둘레 : "+round);
	}
}
