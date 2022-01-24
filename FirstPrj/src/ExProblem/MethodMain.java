package ExProblem;

import java.util.Scanner;

// 3개의 int형 인수 a, b, c 중 최솟값을 구하는 min 메서드를 작성하자.

public class MethodMain {
	
	static int min(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}
	
	
	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.println("정수 a : ");
		int a = st.nextInt();
		System.out.println("정수 a : ");
		int b = st.nextInt();
		System.out.println("정수 a : ");
		int c = st.nextInt();
		System.out.println("최솟값은 " + min(a, b, c) + "입니다.");
		
	}

}
