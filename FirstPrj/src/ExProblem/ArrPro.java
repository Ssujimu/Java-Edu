package ExProblem;

public class ArrPro {

	public static void main(String[] args) {
		int[] arr = new int[5];	// 배열선언
		
		for(int i =0; i < arr.length; i++) {
			arr[i] = 5-i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("a[" + i + "] = " + arr[i]);
		}

	}

}
