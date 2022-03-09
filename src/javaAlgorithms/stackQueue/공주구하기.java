package javaAlgorithms.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		System.out.println(solution(N, K));
	}

	private static int solution(int n, int k) {
		Queue<Integer> que = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			que.offer(i);
		}
		
		while(que.size()>1) {
			for(int i=0; i<k-1; i++) {
				que.offer(que.poll());
			}
			que.poll();
		}
		
		return que.poll();
	}
}
