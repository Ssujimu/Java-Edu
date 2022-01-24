package ch8;

public class LocalVar {
	int memVar;
	
	void localTest() {
		int a = 10, c;
		{
			int b = 20;
			System.out.println("블록 안");
			System.out.println("a = " + a + ", b = " + b);
		}
		
		// System.out.println("a = " + a + ", b = " + b); ----에러 발생
		
		int b = 30;
		System.out.println("블록 밖");
		System.out.println("a = " + a + ", b = " + b);
		//System.out.println("a = " + a + ", b = " + b + ", c = " + c); --- 에러
		
		System.out.println("값 할당 전의 memVar = " + memVar);
		memVar = 100;
		System.out.println("값 할당 후의 memVar = " + memVar);
	}
		void printVar() {
			System.out.println("memVar = " + memVar);
			// System.out.println("a = " + a + ", b = " + b);--- 에러
		}
}
