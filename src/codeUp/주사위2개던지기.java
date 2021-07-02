package codeUp;

import java.util.Scanner;

public class 주사위2개던지기 {
//	1부터 n까지, 1부터 m까지 숫자가 적힌 서로 다른 주사위 2개를 던졌을 때,
//	나올 수 있는 모든 경우를 출력해보자.
//	
//	입력
//	서로 다른 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다.
//	단, n, m은 10이하의 자연수
//
//	출력
//	나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
//	첫 번째 수는 n, 두 번째 수는 m으로 고정해 1부터 오름차순 순서로 출력하도록 한다.

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] str = stdIn.nextLine().split(" ");
		System.out.println("경우의 수를 출력하겠습니다.");
		for(int i=1; i <= Integer.parseInt(str[0]); i++) {
			for(int j=1; j <= Integer.parseInt(str[1]); j++) {
				System.out.println( i +" "+ j );
			}
		}
	}

}
