package codeUp;

import java.util.Scanner;

public class 평가입력받아다르게출력하기 {
//	평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
//
//	평가 내용
//	평가 : 내용
//	A : best!!!
//	B : good!!
//	C : run!
//	D : slowly~
//	나머지 문자들 : what?
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("평가할 문자를 입력하세요.  ");
		String alphabet = stdIn.next();
		
		if(alphabet.equals("A")) {
			System.out.println("best!!!");
		}else if(alphabet.equals("B")) {
			System.out.println("goods!!");
		}else if(alphabet.equals("C")) {
			System.out.println("run!");
		}else if(alphabet.equals("D")) {
			System.out.println("slowly~");
		}else {
			System.out.println("what?");
		}
	}
}
