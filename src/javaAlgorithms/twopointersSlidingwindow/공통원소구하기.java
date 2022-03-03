package javaAlgorithms.twopointersSlidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 공통원소구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr1 = new int[N];
		for(int i=0; i<N; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] arr2 = new int[M];
		for(int i=0; i<M; i++) {
			arr2[i] = sc.nextInt();
		}
		
		List<Integer> answer = solution(N, M, arr1, arr2);
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i)+" ");
		}
	}

	private static List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int p1=0, p2=0;
		while(p1<n && p2<m) {
			if(arr1[p1] == arr2[p2]) {
				answer.add(arr1[p1]);
				p1++;
			}else if(arr1[p1]>arr2[p2]) {
				p2++;
			}else {
				p1++;
			}
		}
		
		return answer;
	}

}
