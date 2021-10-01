package baekJoon.implementation;

import java.util.Arrays;
import java.util.Scanner;

/*N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.*/

public class ArrangeTheNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		

	}

}
