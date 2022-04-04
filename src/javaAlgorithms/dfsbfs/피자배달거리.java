package javaAlgorithms.dfsbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class PointPizza{
	int x;
	int y;
	public PointPizza(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class 피자배달거리 {
	static List<PointPizza> house,pizza;
	static int N, M, Len;
	static int answer = Integer.MAX_VALUE;
	static int[] combi;
	
	private static void DFS(int L, int S) {
		if(L==M) {
			int sum = 0;
			for(PointPizza h: house) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x-pizza.get(i).x)+Math.abs(h.y-pizza.get(i).y));
				}
				sum+=dis;
			}
			answer = Math.min(answer, sum);
		}else {
			for(int i=S; i<Len; i++) {
				combi[L] = i;
				DFS(L+1 ,i+1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		
		int[][] arr = new int[N][N];
		combi = new int[M];
		
		house = new ArrayList<>();
		pizza = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) house.add(new PointPizza(i, j));
				else if(tmp == 2) pizza.add(new PointPizza(i, j));
			}
		}
		
		Len = pizza.size();
		
		DFS(0, 0);
		
		System.out.println(answer);
		
	}
	
}
