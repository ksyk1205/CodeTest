package javaAlgorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Times implements Comparable<Times>{
	int time;
	char state;
	
	public Times(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(Times o) {
		if(o.time == this.time) return this.state - o.state;
		return this.time - o.time;
	}
	
}

public class °áÈ¥½Ä {
	
	private static int solution(List<Times> list) {
		int answer = Integer.MIN_VALUE;
		
		Collections.sort(list);
		int cnt = 0;
		for(Times ob : list) {
			if(ob.state=='s') {
				cnt++;
			}else if(ob.state=='e') {
				cnt--;
			}
			answer = Math.max(answer, cnt);
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Times> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int st = sc.nextInt();
			int et = sc.nextInt();
			list.add(new Times(st, 's'));
			list.add(new Times(et, 'e'));
		}
		
		System.out.println(solution(list));
		
	}
}
