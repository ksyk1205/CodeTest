package javaAlgorithms.recursiveTreeGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색_인접리스트 {
	static List<ArrayList<Integer>> list;
	static int[] visit;
	static int N;
	static int M;
	static int answer=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		list = new ArrayList<ArrayList<Integer>>();
		visit = new int[N+1];
		
		for(int i=0; i<=N; ++i) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<M; ++i) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list.get(a).add(b);
		}
		
		visit[1]=1;
		DFS(1);
		System.out.println(answer);
		
		
	}

	private static void DFS(int i) {
		if(i==N) {
			answer++;
		}else {
			for(int num : list.get(i)) {
				if(visit[num] == 0) {
					visit[num] = 1;
					DFS(num);
					visit[num] = 0;
				}
			}
		}
		
	}
}
