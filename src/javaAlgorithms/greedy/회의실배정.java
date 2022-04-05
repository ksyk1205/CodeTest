package javaAlgorithms.greedy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
	int start;
	int end;
	public Time(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(Time o) {
		if(o.end == this.end) return this.start-o.start;
		return this.end - o.end;
	}
	
}
public class 회의실배정 {
	
	private static int solution(List<Time> list) {
		int answer = 0;
		Collections.sort(list);
		
		int endT = 0;
		for(Time t : list) {
			if(t.start>=endT) {
				answer++;
				endT = t.end;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Time> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			list.add(new Time(st, et));
		}
		System.out.println(solution(list));
	}

	
}
