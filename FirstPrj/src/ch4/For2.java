package ch4;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum = 0;
		System.out.println("1~10까지의 합");		// 1~10까지의 합
		
		for(i = 1; i <= 10; i++) {
			sum += i;							// 축약 sum = sum + i
		}
		System.out.println("sum = " + sum);		// sum = 5050
	}

}


