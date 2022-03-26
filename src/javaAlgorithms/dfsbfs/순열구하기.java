package javaAlgorithms.dfsbfs;

import java.util.Scanner;

public class 순열구하기 {
	static int[] pm;
	static boolean[] visit;
	static int N, M;
	private static void permutation(int num, int[] arr) {
		if(num == M) {
			for(int n: pm) {
				System.out.print(n+" ");
			}
			System.out.println();
		}else {
			for(int i=0; i<N; i++) {
				if(!visit[i]) {
					visit[i] = true;
					pm[num] = arr[i];
					permutation(num+1, arr);
					visit[i] = false;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		int[] arr = new int[N];
		visit = new boolean[N];
		pm = new int[M];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		permutation(0, arr);
		
	}

}
