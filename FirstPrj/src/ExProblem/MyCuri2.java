package ExProblem;

import java.util.Scanner;

public class MyCuri2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		String Add;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하시오.");
		a = sc.nextInt();
		System.out.println("입력한 값 : " + a);
		
		
		System.out.println("주소를 입력하세요.");
		Add = sc.next();
		// Add = sc.nextLine(); <- 이와 같이 실행 시 주소 입력을 받지 못한다.
		// Add = sc.next(); <- 이와 같이 실행 시 띄어쓰기 인식을 못함. 
		/* 알아본 바 nextLine은 \n을 포함해 입력을 받는데 위의 nextInt를 입력받고 엔터를 치면 엔터까지 입력이 되어 nextLine이 입력을 못 받는 것 같다.
		해결하기 위해선 scanner를 새로 선언하거나 nextLine먼저 입력받고 nextInt를 입력받아야 하는 것 같다. 다른 방법도 있는 것 같지만 너무 복잡해 보여서 패스..
		*/
		System.out.println("입력한 주소 : " + Add);
	}

}

/* 
그리고 무슨 이유에선지 이클립스에서 주석처리한 것들이 짤린다. 주석처리를 세 줄을 했는데 한 줄만 나온다던지 ㅠㅠ 
현재는 이클립스에서 푸시를 하지않고 깃허브 내에서 upload file을 통해 파일을 올려서 그런걸까..
나중에 알아봐야 겠다.
*/
