package ch5;

public class Arr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		int i, j;
		for(i = 0; i < arr.length; i++) {				// 배열의 길이 length  문자열의 길이는 length()
			for(j = 0; j < arr[i].length; j++) {		
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		System.out.println("\n" + arr.length);
	}

}
