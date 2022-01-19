package ch4;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		
		System.out.println("1~100까지의 합");		// 1~100까지의 합
		for(i=1; i <= 100; i++) {
			sum+=i;
		}
		System.out.println("sum = " + sum);		// sum = 5050
	}

}

/* 
 * int i, sum =0;
 * sum = sum+i;
 * 		= 0 + 1 ->i
 * 		= (0 + 1) + 2 ->i
 * 		= [(0 + 1) + 2] + 3 ->i
 * 		= [[(0 + 1) + 2] + 3] + ... + 100 ->i
 */
