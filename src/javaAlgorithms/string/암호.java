package javaAlgorithms.string;

import java.util.Scanner;

public class ¾ÏÈ£ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(N,str));
	}

	private static String solution(int n, String str) {
		String answer="";
		for(int i=0; i<n; i++) {
			String s = str.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(s,2);
			answer += (char)num;
			str = str.substring(7);
		}
		return answer;
	}
}
