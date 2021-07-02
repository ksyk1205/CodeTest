package codeUp;

import java.util.Scanner;

public class 정수1개입력받아카운트다운출력하기1 {
//	정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자.
//	
//	n = n-1  #n에 저장되어있던 값에서 1만큼 뺀 후, 그 값을 다시 n에 저장시킨다.
//	n -= 1 과 같이 짧게 작성할 수도 있다. n -= 1 은 n = n-1 과 같은 의미이다.
//	이렇게 산술연산자(+, -, *, / ... )와 대입 연산자(=)를 함께 쓰는 것을 복합대입연산자라고도 부른다.
//	같은 방법으로 +=, *=, /=, //=, %=, &=, |=, ^=, >>=, <<=, **= 등과 같이 짧게 작성할 수 있다.
//
//	처음에 조건식을 검사하고, 그 다음에 실행하고, 그 다음에 값을 바꾸고...
//	다시 조건식을 검사하고, 실행하고, 값을 바꾸고...
//	
//	입력 예시   
//	5
//
//	출력 예시
//	5
//	4
//	3
//	2
//	1
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		int num = stdIn.nextInt();
		while(num > 0) {
			System.out.println(num);
			num-=1;
		}
		
	}

}
