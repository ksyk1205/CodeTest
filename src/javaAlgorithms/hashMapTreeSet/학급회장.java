package javaAlgorithms.hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 학급회장 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		
		System.out.println(solution(N, str));
		
	}

	private static Character solution(int n, String str) {
		Map<Character,Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray()) {	
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		char answer = ' ';
		int max = 0;
		for(char key : map.keySet()) {
			if(max<map.get(key)) {
				max = map.get(key);
				answer = key;
			}
		}
		return answer;
	} 
}
