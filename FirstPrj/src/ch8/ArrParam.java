package ch8;

public class ArrParam {
	int max;
	int sum;
	float avg;
	
	void makeMax(int[] arr) {	// 배열요소 중 가장 큰 값을 찾아 멤버변수 max에 저장
		int i;
		max = arr[0];
		for(i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
	}
	
	// 파라메터로 전달받은 배열의 총합을 계산해서 sum에 저장.
	void makeSum(int[] arr) {
		int i;
		sum = 0;
		for(i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
	}
	
	// 파라메테로 전달받은 배열의 평균을 계산해서 avg에 저장.
	void makeAvg(int[] arr) {
		makeSum(arr);
		avg = (float)sum / arr.length;
	}
}
