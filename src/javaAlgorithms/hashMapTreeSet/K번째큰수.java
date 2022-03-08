package javaAlgorithms.hashMapTreeSet;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class K번째큰수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, K, arr));
		
	}

	private static int solution(int n, int k, int[] arr) {
		int answer = -1;
		Set<Integer> set = new TreeSet<>(Collections.reverseOrder());
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					set.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt =0;
		for(int num : set) {
			cnt++;
			if(cnt==k) {
				return num;
			}
		}
		
		return answer;
	}
}
