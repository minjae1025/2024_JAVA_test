package ex4;

class Teacher extends SchoolMember {
	private String sub;
	private int year;
	
	public Teacher(String num, String name, String sub, int year) {
		super(num, name);
		this.sub = sub;
		this.year = year;
	}
	
	void Print() {
		System.out.printf("%s\t%s\t%-10s\t%2d\n", num, name, sub, year);
	}
}
