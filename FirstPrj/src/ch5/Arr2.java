package ch5;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력한 값의 최대값 구하기
		Scanner sc = new Scanner(System.in);
		int i, max;
		int[] arr = new int[10];					// 입력할 값 10개를 배열에 저장
		System.out.println("정수 10개를 입력하라");
		for(i=0; i < arr.length; i++) {				// arr.length = 10 -> 배열의 길이
			arr[i] = sc.nextInt();
		}
		// max에 배열 첫 값으로 초기화
		max = arr[0];
		// 입력받은 10개의 숫자 중 가장 큰 값을 구한다.
		for(i = 0; i < arr.length; i++) {
			if(max < arr[i]) {						// max는 배열 arr[i]보다 작다면
				max = arr[i];						// max는 arr[i]이다. 이게..머노
			}
		}
		
		System.out.println("max = " + max);
	}

}

/* 
 * 자, 예를 들어 arr[] = {1, 3, 8, 10, 20} 순으로 숫자를 입력했다 치자.
 * 그러면 max = arr[0]값으로 초기화하고 시작이기 때문에 max = arr[0]이 된다.
 * arr[0] < arr[1]을 비교 -> 1 < 3
 * arr[1] < arr[2] -> 3 < 8
 * arr[2] < arr[3] -> 8 < 10
 * arr[3] < arr[4] -> 10 < 20
 * 이렇게 비교하면서 최대값을 구한다.max같은 그대로 내려온다.
 * 
 * 아니 뭐지 이해가 안가네 돌머리라 그런가..
 * */
