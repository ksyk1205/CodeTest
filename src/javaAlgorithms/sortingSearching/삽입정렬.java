package javaAlgorithms.sortingSearching;

import java.util.Scanner;

public class »ğÀÔÁ¤·Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] answer = solution(N, arr);
		for(int num: answer) {
			System.out.print(num+" ");
		}
	}

	private static int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int tmp = arr[i], j;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>tmp) {
					arr[j+1] = arr[j];
				}else {
					break;
				}
			}
			arr[j+1] = tmp;
		}
		return arr;
	}
}
