package ch9;

public class Member2Main {
	public static void main(String[] args) {
		Member2 m1 = new Member2();		// 객체 생성 시 생성자 호출
		m1.print();
		Member2 m2 = new Member2("아이유");
		m2.print();
		Member2 m3 = new Member2("김말숙", "010-9999-8888", "대한민국");
		m3.print();
	}
}
