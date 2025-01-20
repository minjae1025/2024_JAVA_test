package ex4;

public class Student extends SchoolMember {
	private char subj;
	private int s_year;
	
	public Student(String num, String name, char subj, int s_year) {
		super(num, name);
		this.subj = subj;
		this.s_year = s_year;
	}
	
	
	void Print() {
		String department;
		if (subj == 'S') {
			department = "Software";
		}
		else {
			department = "Design";
		}
		String SchoolYear = String.valueOf(s_year);
		if (s_year > 3 || s_year < 1) {
			SchoolYear = "Error("+s_year+")";
		}
		System.out.printf("%s\t%s\t%-10s\t%2s\n", num, name, department, SchoolYear);
	}
}
