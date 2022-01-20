package ExProblem;

public class PrePos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 7, b;
		
		b=a++;
		System.out.println("a = " + a);			// a = 8
		System.out.println("b = " + b);			// b = 7
		
		System.out.println();
		
		b=++a;
		System.out.println("a = " +a);			// a = 9
		System.out.println("b = " +b);			// b = 9
		
		System.out.println();
		
		b=a--;
		System.out.println("a = " +a);			// a = 8
		System.out.println("b = " +b);			// b = 9
		
		System.out.println();
		
		b=--a;
		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}

}
