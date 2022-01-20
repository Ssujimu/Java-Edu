package ch5;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 사람의 국, 영, 수, 총점을 저장할 배열 생성
		int [][] jumsu = new int[3][4];			// 세 사람이기 때문에 3행, 국영수총 = 4개의 점수 4열
		
		// 타이틀로 사용할 문자열 목록
		String[] title = {"국어", "영어", "수학", "총점"};
		
		Scanner sc = new Scanner(System.in);
		
		int i, j;
		for(i = 0; i < jumsu.length; i++)		// 길이 3
		{
			// 각 행의 총점 칸을 0 으로 초기화
			jumsu[i][3] = 0;
			
			// 국영수 점수를 입력받고 총점을 구한다.
			System.out.println(i + "번째 행의 점수를 입력");
			for(j= 0 ; j< jumsu[i].length - 1; j++)			// -1 총점 제외
			{
				System.out.print(title[j] + "점수입력: ");
				jumsu[i][j] = sc.nextInt();
				
				// 입력받은 점수를 총점칸에 누적
				jumsu[i][3] += jumsu[i][j];
			}
			System.out.println();
		}
		
		// 결과 타이틀 출력
		for(i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}
		System.out.println();
		
		// 결과출력
		for(i = 0; i < jumsu.length; i++) {
			for(j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}

/*
 * 와 어질어질 하당
 */
