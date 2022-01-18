package ExProblem;

import java.util.Scanner;

public class MyCuri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String Add;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하시오.");
		a = sc.nextInt();
		System.out.println("입력한 값 : " + a);
		
		
		System.out.println("주소를 입력하세요.");
		Add = sc.next();
		// Add = sc.nextLine(); <- 이와 같이 실행 시 주소 입력을 받지 못한다.
		System.out.println("입력한 주소 : " + Add);
	}

}
