package javaAlgorithms.array;

import java.util.Scanner;

public class ¼Ò¼ö {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(solution(N));
	}

	private static int solution(int n) {
		int cnt = 0;
		
		int[] arr = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(arr[i]==0) {
				cnt++;
				for(int j=i; j<=n; j+=i) {
					arr[j]=1;
				}
			}
		}
		
		return cnt;
	}
}
