package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	/*
	 * 세 개의 자연수 A, B, C가 주어질 때 
	 * A × B × C를 계산한 결과에 0부터 9까지 
	 * 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
	 * 
	 * 예를 들어 A = 150, B = 266, C = 427 이라면 
	 * A × B × C = 150 × 266 × 427 = 17037300 이 되고,
	 *  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	 */	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int num = A*B*C;
		
		int[] arr = new int[10];
		
		while(num>0) {
			int n = num%10;
			num /=10;
			
			arr[n]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
