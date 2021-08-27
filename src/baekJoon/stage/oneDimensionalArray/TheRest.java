package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TheRest {
	/*
	 * 두 자연수 A와 B가 있을 때, 
	 * A%B는 A를 B로 나눈 나머지 이다. 
	 * 
	 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
	 * 
	 * 수 10개를 입력받은 뒤, 
	 * 이를 42로 나눈 나머지를 구한다. 
	 * 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		
		for(int i=0; i<10; i++) {
			int n = Integer.parseInt(br.readLine());
			int rest = n%42;
			arr[rest]++;
		}
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] !=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
