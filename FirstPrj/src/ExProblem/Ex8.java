package ExProblem;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정숫값을 읽어 부호(양수/음수/0)를 판정하는 프로그램을 작성
		
		int a;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		a=sc.nextInt();
		
		if (a > 0) {
			System.out.println("양수 입니다.");
		} else if (a < 0){
			System.out.println("음수 입니다.");
		} else if (a==0) {					// else 만 적고 넘어가도 된다..뭔가 확실하게 하고 싶어서 조건을 주었던 나..
			System.out.println("0 입니다.");
		}
	}

}
