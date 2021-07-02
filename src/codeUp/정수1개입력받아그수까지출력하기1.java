package codeUp;

import java.util.Scanner;

public class 정수1개입력받아그수까지출력하기1 {
//	정수(0 ~ 100) 1개를 입력받아 0부터 그 수까지 순서대로 출력해보자.
//	
//	입력 예시   
//	4
//
//	출력 예시
//	0
//	1
//	2
//	3
//	4

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = stdIn.nextInt();
		
		for(int i=0; i<=num; i++) {
			System.out.println(i);
		}
	}

}
