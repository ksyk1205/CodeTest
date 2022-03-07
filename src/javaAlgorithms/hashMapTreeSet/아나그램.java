package javaAlgorithms.hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 아나그램 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(solution(str1, str2));
		
	}

	private static String solution(String str1, String str2) {
		Map<Character, Integer> map = new HashMap<>();
		for(char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(char c: str2.toCharArray()) {
			if(map.containsKey(c) && map.get(c)!=0) {
				map.put(c, map.get(c)-1);
			}else {
				return "NO";
			}
		}
		
		return "YES";
	}
}
