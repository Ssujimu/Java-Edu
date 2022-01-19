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
		
		int a=5, b;
		
		b=a++;
		System.out.println("b = " + b);
		System.out.println("a = " + a);
	}

}


// 어우 헷갈린다 헷갈려 전위 ~  후위~ 다시 
