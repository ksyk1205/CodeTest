package javaAlgorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 큰수출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int num : solution(N, arr)) {
			System.out.print(num + " ");
		}
	}

	private static List<Integer> solution(int n, int[] arr) {
		List<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for(int i=1; i<n; i++) {
			if(arr[i-1]<arr[i]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
}
