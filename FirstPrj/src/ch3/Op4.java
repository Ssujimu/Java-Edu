package ch3;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		
		System.out.println(a==10 && b==20);		// true
		System.out.println(a>10 && b==20);		// false
		System.out.println(a==10 && b==10);		// false
		System.out.println(a<10 && b>20);		// false
		
		System.out.println(a==10 || b==20);		// true
		System.out.println(a>20 || b==20);		// true
		System.out.println(a==10 || b==10);		// true
		System.out.println(a<10 || b>20);		// false
	}

}
