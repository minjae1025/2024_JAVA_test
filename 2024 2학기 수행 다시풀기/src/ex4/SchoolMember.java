package ex4;

public class SchoolMember {
	String num;
	String name;
	
	public SchoolMember(String num, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
	}
	
	boolean NumCheck(String Value) {
		return this.num.contains(Value)? true: false;
	}
	
	void Print() {
		System.out.printf("%s\t%s", num, name);
	}
}
