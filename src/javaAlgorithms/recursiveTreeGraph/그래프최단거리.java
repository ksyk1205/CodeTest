package javaAlgorithms.recursiveTreeGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {
	static List<ArrayList<Integer>> list;
	static int[] visit;
	static int[] dis;
	static int N;
	static int M;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		list = new ArrayList<ArrayList<Integer>>();
		visit = new int[N+1];
		dis = new int[N+1];
		
		for(int i=0; i<=N; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list.get(a).add(b);
			
		}
		
		BFS(1);
		
		for(int i=2; i<=N; i++) {
			System.out.println(i+" : "+dis[i]);
		}
		
		
	}


	private static void BFS(int i) {
		Queue<Integer> que = new LinkedList<>();
		que.add(i);
		visit[i] =1;
		dis[i] = 0;
		
		while(!que.isEmpty()) {
			int cur = que.poll();
			for(int num : list.get(cur)) {
				if(visit[num]==0) {
					visit[num]=1;
					que.offer(num);
					dis[num] = dis[cur]+1;
				}
			}
		}
		
	}
}
