package codeUp;

import java.util.Scanner;

public class 문자1개입력받아알파벳출력하기 {
//	영문 소문자(a ~ z) 1개가 입력되었을 때,
//	a부터 그 문자까지의 알파벳을 순서대로 출력해보자.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("영문 소문자(a~z)를 입력하세요.");
		int str = stdIn.next().charAt(0);
		
		int a = 96;
		while(str >0) {
		  a++;
		  System.out.println((char)a);
		  if(str == a) {
			  break;
		  }
		}
		 
	}
}
