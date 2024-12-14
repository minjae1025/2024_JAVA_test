package exam4;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[][] = {
				{"MT1", "강민준", "디자인일반", "25"},
				{"MA1", "송서준", "행정", "16"},
				{"MS1", "고서윤", "S", "1"}
		};
		
		SchoolMember[] pSm = new SchoolMember[data.length];
		
		for (int i = 0; i<data.length; i++) {
			if (data[i][0].charAt(1) == 'T') {
				pSm[i] = new Teacher(data[i][0],data[i][1], data[i][2], Integer.parseInt(data[i][3]));
			}
			else if (data[i][0].charAt(1) == 'A') {
				pSm[i] = new Admin(data[i][0],data[i][1], data[i][2], Integer.parseInt(data[i][3]));
			}
			else {
				pSm[i] = new Student(data[i][0],data[i][1], data[i][2].charAt(0), Integer.parseInt(data[i][3]));
			}
		}
		
		for (int i = 0; i<data.length; i++) {
			System.out.println();
		}
	}

}

class SchoolMember {
	String num;
	String name;
	
	public SchoolMember(String num, String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.num = num;
	}
}

class Teacher extends SchoolMember {
	private String sub;
	private int year;
	
	public Teacher(String num, String name, String sub, int year) {
		super(num, name);
		this.sub = sub;
		this.year = year;
	}
}

class Student extends SchoolMember {
	private char subj;
	private int s_year;
	
	public Student(String num, String name, char subj, int s_year) {
		super(num, name);
		this.subj = subj;
		this.s_year = s_year;
	}
}

class Admin extends SchoolMember {
	private String work;
	private int year;
	
	public Admin(String num, String name, String work, int year) {
		super(num, name);
		this.work = work;
		this.year = year;
	}
}