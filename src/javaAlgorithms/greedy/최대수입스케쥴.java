package javaAlgorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	int money;
	int time;
	
	public Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.time - this.time;
	}
}

public class 최대수입스케쥴 {
	static int N, max = Integer.MIN_VALUE;
	
	private static int solution(List<Lecture> list) {
		int answer = 0;
		
		Collections.sort(list);
		Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
		int j=0;
		for(int i=max; i>0; i--) {
			for(; j<N; j++) {
				if(list.get(j).time == i ) {
					que.offer(list.get(j).money);
				}else {
					break;
				}
			}
			if(!que.isEmpty()) answer +=que.poll();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		List<Lecture> list = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			int money = sc.nextInt();
			int time = sc.nextInt();
			list.add(new Lecture(money, time));
			if(time>max) max = time;
		}
		
		System.out.println(solution(list));
	}
}
