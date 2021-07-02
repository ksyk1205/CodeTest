package codeUp;

import java.util.Scanner;

public class 원하는문자가입력될때까지반복출력하기 {
//	영문 소문자 'q'가 입력될 때까지
//	입력한 문자를 계속 출력하는 프로그램을 작성해보자.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			String str = stdIn.next();
			if(str.equals("q")) {
				break;
			}
		}	
	}

}
