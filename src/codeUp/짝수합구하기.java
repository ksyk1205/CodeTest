package codeUp;

import java.util.Scanner;

public class 짝수합구하기 {
//	정수(1 ~ 100) 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보자.
//	
//	입력
//	정수 1개가 입력된다.
//	(0 ~ 100)
//
//	출력
//	1부터 그 수까지 짝수만 합해 출력한다.
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = stdIn.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("1부터"+num+"까지 짝수의 합만 춣력한다.");
		System.out.println(sum);
	}

}
