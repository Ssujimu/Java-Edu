package ExProblem;

import java.util.Scanner;

public class Scanstar {

	public static void main(String[] args) {
		// 입력한 값의 개수만큼 '*'를 표시하는 프로그램을 작성하자. 마지막에는 줄 바꿈 문자를 출력할 것.
		// 단, 읽은 값이 1미만이면 줄 바꿈 문자를 표시해서는 안된다.
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 *을 표시할까요? : ");
		int n = sc.nextInt();
		if(n > 0) {								// 개수 n이 0보다 클 때
			int i = 0;
			while(i < n) {						// 반복한다. i가 n보다 작을때 *을 출력.
				System.out.print('*');
				i++;							// i 증가
			}
			System.out.println();
		}
	}

}


/*
 * 저는 문제 이해도 못하는 똥멍충이 입니다..
 * 입력한 값..그니까 *을 출력할 값을 적는다
 * *을 몇 개 출력할까? -> 26 => *을 26개 출력
 * 이런 말인데 왜 잘못 이해했지.,.
 * 그니까 난 한글 개수만큼 출력하는 건줄
 * 한 글자에 별 하나..그런건줄..
 * 안녕하세요 = 별 다섯개 출력하는 건줄 ㅎㅎ
 * 근데 이해해도 못푸렁낄낄
 */
