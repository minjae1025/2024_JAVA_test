package ex4;

class Admin extends SchoolMember {
	private String work;
	private int year;
	
	public Admin(String num, String name, String work, int year) {
		super(num, name);
		this.work = work;
		this.year = year;
	}
	
	void Print() {
		System.out.printf("%s\t%s\t%-10s\t%2d\n", num, name, work, year);
	}
}