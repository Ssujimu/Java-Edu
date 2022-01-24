package ch8;

public class StaticMethodMain {

	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		StaticMethod.a = 10;
		sm.b = 20;		// 입력은 된 상태이지만 쓰이진 않음
		StaticMethod.test(30);
	}

}
