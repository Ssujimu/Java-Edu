package ch11;

public class ParentMain {

	public static void main(String[] args) {
		Parent p = new Parent();	// 객체가 생성되면 바로 생성자가 호출되어 메세지를 출력
		p.name = "부모";
		p.age = 50;
		p.setMoney(1000000);
		p.printParentInfo();
		System.out.println("money : " + p.getMoney());
		System.out.println("---------------");
		
		Child c = new Child();	// child객체가 생성되기 이전에 parent 객체가 자동으로 생성. 자연의 이치와 같음.
		c.name = "자식";
		c.age = 200;
		c.setHobby("기타");
		c.printParentInfo();
		c.printInfo();
	}

}

/*
Parent 생성자
name : 부모
age : 50
money : 1000000
---------------
Parent 생성자
Child 생성자
name : 자식
age : 200
name : 자식
age : 200
hobby : 기타
*/

