package javaAlgorithms.string;

import java.util.Scanner;

public class 문장속단어 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

	private static String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		int pos;
		while((pos = str.indexOf(" "))!=-1) {
			String s = str.substring(0,pos);
			if(s.length()>max) {
				max = s.length();
				answer = s;
			}
			str = str.substring(pos+1,str.length());
		}
		if(str.length()>max) {
			answer = str;
		}
		return answer;
	}
}
