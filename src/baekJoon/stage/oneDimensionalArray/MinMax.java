package baekJoon.stage.oneDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
	/* N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.print(arr[0]+" "+arr[n-1]);
	}

}
