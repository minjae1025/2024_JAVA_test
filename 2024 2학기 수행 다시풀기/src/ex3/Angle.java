package ex3;

class Angle extends Shape {
	static int cnt = 0;
	Angle(int width, int heigth) {
		super(width);
		this.heigth = heigth;
		cnt++;
	}
	
	double area() {
		area = width * heigth;
		return area;
	}
	
	public String toString() {
		return ("번째 도형 : 면적 "+area+"인 사각형");
	}
	
	void maxPrint() {
		System.out.println("사각형이다.");
	}
}
