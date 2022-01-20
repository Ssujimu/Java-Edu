package ch4;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while (! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
	}

}

/*
메시지를 입력하세요.
프로그램을 종료하려면 q를 입력하세요.
>
안녕			<- 내가 입력
안녕			<- 그대로 출력
>
에에			<- 내가 입력
에에
>
q			<- 내가 입력
q

프로그램 종료
*/