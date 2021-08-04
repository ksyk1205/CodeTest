package programers.level_1;

import java.util.Scanner;

public class 짝수와홀수 {
	public static void main(String[] arg) {
		/*
		문제 설명
		정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.

		제한 조건
		num은 int 범위의 정수입니다.
		0은 짝수입니다.
		입출력 예
		num	return
		3	"Odd"
		4	"Even"
		*/
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = stdIn.nextInt();
	
		String answer = solution(num);
		
		System.out.println("num         retrun");
		System.out.println(num+"        "+answer);
		
	}
	public static String solution(int num) {
		return num%2==0 ? "Even" : "Odd";
    }
}
