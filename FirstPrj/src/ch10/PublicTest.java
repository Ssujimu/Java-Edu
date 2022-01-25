package ch10;

public class PublicTest {
	public int x;
	private int y;	// 클래스 안에서만 접근 가능
	
	public PublicTest(int x, int y) {
		this.x = x;
		this.y = y;	// private멤버. 클래스 안에서는 접근 가능
	}
	
	public void print() {
		setValue();
		System.out.println("x = " +   x + ", y = " + y);
	}
	
	private void setValue() { // setValue접근제어 지정자는 private
		x = 100;				// 클래스 내에서만 가능.
		y = 100;
	}
}
