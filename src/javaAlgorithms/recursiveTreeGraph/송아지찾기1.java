package javaAlgorithms.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기1 {
	static Queue<Integer> que = new LinkedList<>();
	static int[] dis = {1, -1, 5};
	static int[] check;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		
		System.out.println(BFS(S, E));
	}

	private static int BFS(int s, int e) {
		int level = 0;
		check = new int[10001];
		check[s] =1;
		
		que.offer(s);
		while(!que.isEmpty()) {
			int len = que.size();
			for(int i=0; i<len; i++) {
				int num  = que.poll();
				for(int j=0; j<3; j++) {
					int x = num + dis[j];
					if(x==e) {
						return level+1;
					}
					if(x>=1 && x<=10000 && check[x]==0) {
						check[x] =1;
						que.offer(x);
					}
				}
			}
			level++;
		}
		
		return level;
	}
}
