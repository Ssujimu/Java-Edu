package ch10;

public class Member {
	private String name; // 멤버는 모두 private, 보통 클래스의 멤버변수는 private으로 지정해 외부로 정보가 직접 공개되는 것을 막는다.
	private String tel;
	private String address;
	
	public void printMember() {	// public 클래스 밖에서 호출 가능.
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
	public String getName() {	// 멤버변수 name의 getter로 클래스 밖에서 name의 값을 읽을때 호출.
		return name;
	}
	
	public void setName(String name) {	// 멤버변수 name의 setter로
		this.name = name;	// 클래스 밖에서 넣어준 파라메터 값을 name에 할당
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
