package ch4;

public class For7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 가로 출력을 위해
		int i, j;
		for(i=0; i<10; i++) {											// 곱해지는 수
			for(j=2; j<10; j++) {										// 단
				if(i==0) {
					System.out.print(j+ "단\t");							// 단 제목 출력
				} else {
					System.out.print(j + "*" + i + "="+ (j*i+"\t"));
				}
			}
			System.out.println();								// 2*1 3*1 4*1 ... 9*1을 하고 난 다음 2*2...을 출력하기 위해 println
		}
	}

}
