package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.*/

public class NumberSorting3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int num:arr) {
			sb.append(num).append("\n");
		}
		System.out.println(sb);

	}

}
