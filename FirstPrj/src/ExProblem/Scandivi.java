package ExProblem;

import java.util.Scanner;

public class Scandivi {

	public static void main(String[] args) {
		// 입력한 정숫값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);
		int num;
		int i;
		// 입력받는값 : num, 나누는 값 : i
		int result = 0;
		System.out.println("정수값을 입력하면 약수와 개수를 표시.");
		num = sc.nextInt();						// 스캐너를 통해 10을 입력n(10)
		
		System.out.println("약수");
		for(i = 1; i <= num; i++) {				// 이때 for문은 10번이 실행된다.
			if((num%i)==0) {					// 입력된 수 num 나누기 i 했을시 0이 되었을때 실행
				System.out.print(i+ " ");
				result++;						// 마지막 개수 결과 = result. if문 안에 있기 때문에 약수가 있을때 1씩 증가하게됨
			}									
		}
		System.out.println();
		System.out.println("개수 : " + result);
	}

}
// 약수를 구할 숫자를 scanner로 입력받으면 그 숫자보다 작은 숫자 i로 나누어 0으로 떨어지는 숫자를 출력
/*
블로그가 알려준거 보고 해버렸다..뿌앵
아ㅏ
*/
