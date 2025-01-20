package ex3;

class Circle extends Shape {
	static int cnt = 0;
	Circle(int width) {
		super(width);
		cnt++;
	}
	
	double area() {
		area = width * width * Math.PI;
		return area;
	}
	
	public String toString() {
		return ("번째 도형 : 면적 "+area+"인 원");
	}
	
	void maxPrint() {
		System.out.println("원이다.");
	}
	
}
