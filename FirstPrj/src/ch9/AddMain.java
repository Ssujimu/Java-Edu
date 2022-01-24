package ch9;

public class AddMain {

	public static void main(String[] args) {
		Add a = new Add();
		System.out.println("int 형 param 2개의 add() 호출 : " + a.add(3, 5));
		System.out.println("int 형 param 3개의 add() 호출 : " + a.add(3, 5, 4));
		System.out.println("flaot 형 param 2개의 add() 호출 : " + a.add(3.4f, 4.7f));
		System.out.println("String 형 param 2개의 add() 호출 : " + a.add("aaa", "bbb"));

	}

}
