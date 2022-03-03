package javaAlgorithms.twopointersSlidingwindow;

import java.util.Scanner;

public class 연속된자연수의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(solution(N));
		
	}

	private static int solution(int n) {
		int answer = 0;
		int sum = 0;
		int lt = 1;
		for(int rt = 0; rt<=n/2+1; rt++) {
			sum+=rt;
			if(sum==n)answer++;
			while(sum>=n) {
				sum-=lt++;
				if(sum==n)answer++;
			}
		}
		return answer;
	}

}
