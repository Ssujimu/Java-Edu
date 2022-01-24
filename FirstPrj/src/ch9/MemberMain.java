package ch9;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member();		// 객체 생성 시 생성자 호출
		m.print();
		m.setMemberData("류현진", "010-1111-2222", "로스엔젤레스");
		m.print();
	}

}
