package ExProblem;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자.
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		a = sc.nextInt();
		System.out.println("입력한 값에 10을 더함 : " + (a + 10));
		System.out.println("입력한 값에 10을 뺌 : " + (a - 10));
	}

}
