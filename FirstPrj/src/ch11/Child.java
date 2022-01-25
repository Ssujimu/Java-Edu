package ch11;

public class Child extends Parent {	// child의 멤버변수는 hobby뿐아니라 상속받은 name, age도 사용.
	private String hobby;
	
	public Child() {
		System.out.println("Child 생성자");
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		// System.out.println("money : " + money); 에러
		// money를 출력하지만 private멤버는 자식 클래스에 상속 x
		System.out.println("hobby : " + hobby);
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
}
