package javaAlgorithms.array;

import java.util.Scanner;

public class 가위바위보 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arrA = new int[N];
		for(int i=0; i<N; i++) {
			arrA[i] = sc.nextInt();
		}
		int[] arrB = new int[N];
		for(int i=0; i<N; i++) {
			arrB[i] = sc.nextInt();
		}
		solution(N, arrA, arrB);
	}

	private static void solution(int n, int[] arrA, int[] arrB) {
		for(int i=0; i<n; i++) {
			if(arrA[i]== arrB[i]) {
				System.out.println("D");
			}else if(arrA[i]==1 && arrB[i]==3) {
				System.out.println("A");
			}else if(arrA[i]==2 && arrB[i]==1) {
				System.out.println("A");
			}else if(arrA[i]==3 && arrB[i]==2) {
				System.out.println("A");
			}else {
				System.out.println("B");
			}
		}
	}
}

