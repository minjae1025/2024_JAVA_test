package ex3;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Shape[] shape = new Shape[7];
		for (int i = 0; i<shape.length; i++) {
			int menu;
			do {
				System.out.print("도형 선택(1: 원, 2: 사각형, 3: 부채꼴) : ");
				menu = sc.nextInt();
			} while(menu <= 0 || menu >= 4);
			
			if (menu == 1) {
				System.out.print("반지름 입력: ");
				int ban = sc.nextInt();
				shape[i] = new Circle(ban);
				System.out.println("반지름 "+shape[i].width+"인 원의 면적은 "+shape[i].area());
			}
			
			else if (menu == 2) {
				System.out.print("가로 입력: ");
				int width = sc.nextInt();
				System.out.print("세로 입력: ");
				int heigth = sc.nextInt();
				shape[i] = new Angle(width, heigth);
				System.out.println("가로 "+shape[i].width+"이고 세로 "+ shape[i].heigth+ "인 사각형 면적은 "+shape[i].area());
			}
			
			else if (menu == 3) {
				System.out.print("반지름 입력: ");
				int ban = sc.nextInt();
				shape[i] = new Rectangle(ban);
				System.out.println("반지름 "+shape[i].width+"인 부채꼴의 면적은 "+shape[i].area());
			}
			System.out.println();
		}
		 
		int idx = 0;
		double max = 0;
		System.out.println("*********************************");
		System.out.println(Circle.cnt+"개의 원과 "+Angle.cnt+"개의 사각형과 "+Rectangle.cnt+"개의 부채꼴 생성");
		for (int i = 0; i<7; i++) {
			if (shape[i].area > max) {
				idx = i;
				max = shape[i].area;
			}
			System.out.println((i+1)+shape[i].toString());
		}
		
		System.out.println("면적이 가낭 넓은 도형 : 면적이");
		System.out.print(shape[idx].area+"인 " +(idx+1)+"번째 도형으로 ");
		shape[idx].maxPrint();
	}

}