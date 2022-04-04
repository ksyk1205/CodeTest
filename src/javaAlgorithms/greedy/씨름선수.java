package javaAlgorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Sunsu implements Comparable<Sunsu>{
	int h;
	int w;
	
	public Sunsu(int h, int w) {
		this.h = h;
		this.w = w;
	}
	@Override
	public int compareTo(Sunsu o) {
		return o.h -this.h;
	}
	
}
public class ¾¾¸§¼±¼ö {
	
	private static int solution(List<Sunsu> list) {
		int answer = 0;
		
		Collections.sort(list);
		
		int max = Integer.MIN_VALUE;
		for(Sunsu p : list) {
			if(p.w>max) {
				answer++;
				max = p.w;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Sunsu> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			list.add(new Sunsu(h, w));
		}
		
		System.out.println(solution(list));
	}

}
