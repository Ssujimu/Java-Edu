package ch3;

public class ConditionalOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 95;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		System.out.println(score + "점이고 " + grade + " 학점 입니다.");	// 95점이고 A 학점 입니다.
	}

}
