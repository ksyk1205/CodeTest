package javaAlgorithms.hashMapTreeSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 모든아나그램찾기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		System.out.println(solution(S, T));
	}

	private static int solution(String s, String t) {
		int answer = 0;
		Map<Character, Integer> smap = new HashMap<>();
		Map<Character, Integer> tmap = new HashMap<>();
		
		for(char c : t.toCharArray()) {
			tmap.put(c, tmap.getOrDefault(c, 0)+1);
		}
		
		for(int i=0; i<t.length()-1; i++) {
			smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0)+1);
		}
		
		int lt=0;
		for(int rt=t.length()-1; rt<s.length(); rt++) {
			smap.put(s.charAt(rt), smap.getOrDefault(s.charAt(rt), 0)+1);
			if(tmap.equals(smap)) {
				answer++;
			}
			
			if(smap.get(s.charAt(lt))>1) {
				smap.put(s.charAt(lt), smap.get(s.charAt(lt))-1);
			}else {
				smap.remove(s.charAt(lt));
			}
			lt++;
			
		}
		
		return answer;
	}
}
