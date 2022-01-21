package ch6;

class Method2Param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double myHeight = 175.9;
		
		hiEveryone(12, 12.5);
		hiEveryone(13, myHeight);
		
		byEveryone();
	}
	
	public static void hiEveryone(int age, double height) {
		System.out.println("제 나이는 " + age + "세 입니다.");
		System.out.println("저의 키는 " + height + "입니다.");
	}
	
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}

}

/*
제 나이는 12세 입니다.
저의 키는 12.5입니다.
제 나이는 13세 입니다.
저의 키는 175.9입니다.
다음에 뵙겠습니다.
 */
