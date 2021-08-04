package programers.level_1;

import java.util.Scanner;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		/*
		문제 설명
		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
		예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

		제한 사항
		s는 길이 1 이상, 길이 8 이하인 문자열입니다.
		입출력 예
		s	return
		"a234"	false
		"1234"	true
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("길이가 4혹은 6인 숫자로 구성된 문자열을 입력하세요");
		String s = stdIn.next();
		
		boolean answer = solution(s); 

	}
	 public static boolean solution(String s) {
		//charcter.isDigit(s) s가 숫자면 true 문자면 false
		//s.charAt(i) index마다 char형식으로 하나씩 뽑는다
	        boolean answer = true;
	        for(int i=0; i<s.length(); i++) {
	        	if(Character.isDigit(s.charAt(i))) {
	        		answer = false;
	        	}
	        }
	        return answer;
	    }

}
