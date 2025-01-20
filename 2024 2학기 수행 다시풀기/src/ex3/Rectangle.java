package ex3;

class Rectangle extends Shape {
	static int cnt = 0;
	Rectangle(int width) {
		super(width);
		cnt++;
	}
	double area() {
		area = width*width*Math.PI/4; 
		return area;
	}
	
	public String toString() {
		return ("번째 도형 : 면적 "+area+"인 부채꼴");
	}
	
	void maxPrint() {
		System.out.println("부채꼴이다.");
	}
}
