package javaAlgorithms.sortingSearching;

import java.util.Scanner;

public class 선택정렬 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] answer = solution(N, arr);
		
		for(int i=0; i<answer.length; i++) {
			System.out.print(answer[i]+" ");
		}
		
	}

	private static int[] solution(int n, int[] arr) {
		int idx;
		for(int i=0; i<n; i++) {
			idx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			int tmp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = tmp;
		}
		return arr;
	}
}
