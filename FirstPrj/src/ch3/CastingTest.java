package ch3;

public class CastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12, b = 13;
		float c = 0;
		c = (a+b)/2;
		System.out.println("a와 b의 평균은 " + c + "이다.");
		float f = 12.5f;
		a = (int)f;
		System.out.println("a = " + a);
	}

}
