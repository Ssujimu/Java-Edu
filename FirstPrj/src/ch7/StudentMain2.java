package ch7;

public class StudentMain2 {
	public static void main(String[] args) {
		Student2 s3 = new Student2();
		s3.name = "유재석";
		s3.kor = 100;
		s3.eng = 70;
		s3.math = 70;
		s3.eval_sum();
		s3.eval_avg();
		System.out.println("객체 s3의 정보");
		s3.print();
		
		Student2 s4 = new Student2();
		s4.name = "박명수";
		s4.kor = 50;
		s4.eng = 30;
		s4.math = 20;
		s4.eval_sum();
		s4.eval_avg();
		System.out.println("객체 s4의 정보");
		s4.print();
	}
		
}
/*
객체 s3의 정보
이름 : 유재석
국어 : 100
영어 : 70
수학 : 70
총점 : 240
평균 : 80.0

객체 s4의 정보
이름 : 박명수
국어 : 50
영어 : 30
수학 : 20
총점 : 100
평균 : 33.333332

*/
