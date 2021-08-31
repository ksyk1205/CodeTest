package baekJoon.stage.stringTest;

import java.util.Scanner;

public class WordStudy {
	/*
	 * 알파벳 대소문자로 된 단어가 주어지면, 
	 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
	 * 소문자를 구분하지 않는다.
	 * 
	 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
	 *  단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] alphabet = new int[26];
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i)-'A';
			alphabet[n]++;
		}
		int max = 0;
		char answer ='?';
		for(int i=0; i<alphabet.length; i++) {
			if(max<alphabet[i]) {
				max = alphabet[i];
				answer = (char)(i+'A');
			}else if(max == alphabet[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
	}

}
