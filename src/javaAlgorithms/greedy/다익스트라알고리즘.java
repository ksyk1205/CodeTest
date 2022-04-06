package javaAlgorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	int dis;
	int coin;
	
	public Edge(int dis, int coin) {
		this.dis = dis;
		this.coin = coin;
	}

	@Override
	public int compareTo(Edge o) {
		return this.dis - o.dis;
	}
}

public class 다익스트라알고리즘 {
	static int N, M;
	static List<ArrayList<Edge>> graph;
	static int[] dis;
	
	private static void solution(int i) {
		Queue<Edge> que = new PriorityQueue<>();
		que.add(new Edge(i,0));
		dis[i] = 0;
		while(!que.isEmpty()) {
			Edge tmp = que.poll();
			int now = tmp.dis;
			int nowCoin = tmp.coin;
			if(nowCoin > dis[now]) {
				continue;
			}
			for(Edge ob : graph.get(now)) {
				if(dis[ob.dis] > nowCoin+ob.coin) {
					dis[ob.dis]=nowCoin+ob.coin;
					que.offer(new Edge(ob.dis, nowCoin+ob.coin));
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		dis = new int[N+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=N; i++) {
			graph.add(new ArrayList<Edge>());
		}
		
		for(int i=0; i<M; i++) {
			int sd = sc.nextInt();
			int ed = sc.nextInt();
			int coin = sc.nextInt();
			graph.get(sd).add(new Edge(ed, coin));
		}
		
		solution(1);
		
		for(int i=2; i<dis.length; i++) {
			if(dis[i] != Integer.MAX_VALUE) {
				System.out.println(i+" : "+dis[i]);
			}else {
				System.out.println(i+" : impossible");
			}
		}
		
		
	}
	
}
