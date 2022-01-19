package ch4;

public class For6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2중 for문으로 2단 3열 출력구조
		int i, j;
		for(i=0; i<2; i++) {				// 행 
			for(j=0; j<3; j++) {			// 열
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
