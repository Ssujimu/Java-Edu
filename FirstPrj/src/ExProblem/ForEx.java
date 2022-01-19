package ExProblem;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("1~100까지의 짝수");
		for(i=1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + "\t");
			}
			if(i%10 == 0) {
				System.out.println();
			}
		}
	}

}
