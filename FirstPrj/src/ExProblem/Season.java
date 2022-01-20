package ExProblem;

import java.util.Scanner;								// 스캐너사용 시 선언해야함

public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);			// 입력받기 위한 스캐너 선언
		
		System.out.println("몇 월 입니까?");
		int month = sc.nextInt();						// 달 입력받기
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");	break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");	break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");	break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");	break;
		}
	}

}
