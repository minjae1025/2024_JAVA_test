package ex4;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[][] = {
//				{"MT1", "강민준", "디자인일반", "25"},
//				{"MA1", "송서준", "행정", "16"},
//				{"MS1", "고서윤", "S", "1"}
				{"MS1", "강서연", "D", "10"},
				{"MS2", "고주원", "S", "7"},
				{"MT1", "양민서", "영어", "21"},
				{"MA1", "송하준", "정보보호", "11"},
				{"MT2", "방서현", "운영체제", "25"},
				{"MS3", "김예준", "S", "3"},
				{"MT3", "이지민", "컴퓨터 그래픽", "8"}
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
		
		System.out.println("Teacher***********************************************");
		for (int i = 0; i<data.length; i++) {
			if (pSm[i].NumCheck("MT")) {
				pSm[i].Print();
			}
		}
		System.out.println("******************************************************");
		System.out.println("Student***********************************************");
		for (int i = 0; i<data.length; i++) {
			if (pSm[i].NumCheck("MS")) {
				pSm[i].Print();
			}
		}
		System.out.println("******************************************************");
		System.out.println("Administrator*******************************************");
		for (int i = 0; i<data.length; i++) {
			if (pSm[i].NumCheck("MA")) {
				pSm[i].Print();
			}
		}
		System.out.println("******************************************************");
	}

}
