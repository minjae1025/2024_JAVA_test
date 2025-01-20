package ex1;

public class Ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Point p = new Point(((int)(Math.random()*51)), ((int)(Math.random()*51)));
		Circle cir = new Circle(p, (int)(Math.random()*15)+1);
		cir.areaPrint();
	}
}

class Point {
	private int x;
	private int y;
	
	Point (int x, int y) {
		this.x = x;
		this.x = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
}

class Circle {
	private int x;
	private int y;
	private int ban;
	private double area;
	private Point p;
	Circle (Point p, int ban) {
		this.p = p;
		this.ban = ban;
	}
	
	void areaPrint() {
		area = ban * ban * Math.PI;
		x = p.getX();
		y = p.getY();
		System.out.printf("점의 좌표<%d, %d>인 반지름 %d인 원의 넓이 : %.3f", x, y, ban, area);
	}
}