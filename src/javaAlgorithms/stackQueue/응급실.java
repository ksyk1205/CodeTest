package javaAlgorithms.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
	
}


public class ¿¿±ﬁΩ« {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M  = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(N, M, arr));
				
	}

	private static int solution(int n, int m, int[] arr) {
		int answer = 0;
		Queue<Person> que = new LinkedList<>();
		for(int i=0; i<n; i++) {
			que.offer(new Person(i,arr[i]));
		}
		
		while(!que.isEmpty()) {
			Person person = que.poll();
			for(Person tmp : que) {
				if(tmp.priority > person.priority) {
					que.offer(person);
					person = null;
					break;
				}
			}
			if(person!=null) {
				if(person.id == m) {
					return ++answer;
				}else {
					answer++;
				}
			}
		}
		
		return answer;
	}

}
