package ex3;

abstract class Shape {
	int width;
	int heigth;
	double area;
	
	abstract double area();
	
	Shape(int width) {
		this.width = width;
	}
	
	public abstract String toString();
	
	abstract void maxPrint();
}

