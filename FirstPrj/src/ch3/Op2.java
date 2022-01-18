package ch3;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j;
		j = i++;
		System.out.println("j = "+j);
		j = ++i;
		System.out.println("j = "+j);
		j = i--;
		System.out.println("j = "+j);
		j = --i;
		System.out.println("j = " + j);
		
		System.out.println("현재 i = " + i);
		System.out.println("i++ : "+ i++);
		System.out.println("++i : " + (++i));
		System.out.println("i-- : " + i--);
		System.out.println("--i : " + (--i));
	}

}
