package codeUp;

import java.util.Scanner;

public class _0입력될때까지무한출력하기 {
//	임의의 정수가 줄을 바꿔 계속 입력된다.
//	-2147483648 ~ +2147483647, 단 개수는 알 수 없다.
//
//	0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
//
//	실행되는 과정은
//	1. 조건식을 평가한다.
//	2. True 인 경우 코드블록을 실행한다.
//	3. 다시 조건식을 평가한다.
//	4. True 인 경우 코드블록을 실행한다.
//	...
//	... 조건식의 평가 값이 False 인 경우 반복을 중단하고, 그 다음 명령을 실행한다.
//
//	조건식의 평가 결과가 True 동안만 반복 실행된다. 

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("**start**");
		while(true) {
			int n = stdIn.nextInt();
			if(n==0) {
				System.out.println("**finish**");
				break;
			}
		}
	}

}
