package exam1;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Point p = new Point(((int)(Math.random()*51)), ((int)(Math.random()*51)));
		Circle cir = new Circle(p, (int)(Math.random()*15)+1);
		cir.areaPrint();
	}

}

class Point {
	private int dot1;
	private int dot2;
	
	Point (int dot1, int dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	int getDot1() {
		return dot1;
	}
	int getDot2() {
		return dot2;
	}
}

class Circle {
	private int dot1;
	private int dot2;
	private int ban;
	private double area;
	Circle (Point p, int ban) {
		this.dot1 = p.getDot1();
		this.dot2 = p.getDot2();
		this.ban = ban;
	}
	
	void areaPrint() {
		area = ban * ban * Math.PI;
		System.out.printf("점의 좌표<%d, %d>인 반지름 %d인 원의 넓이 : %.3f", dot1, dot2, ban, area);
	}
}