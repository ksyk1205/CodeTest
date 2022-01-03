package programers.level_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String s = stdIn.next();
		String answer = solution(s);
		System.out.println(answer);
	}
	 public static String solution(String s) {
		 char[] ch = s.toCharArray();
		 Arrays.sort(ch);
		 return new StringBuilder(new String(ch)).reverse().toString();
	 }

}
