package baekJoon.stage.ifTest;

import java.util.Scanner;

public class 사분면_고르기 {
	/*
	 * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 
	 * 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
	 * "Quadrant n"은 "제n사분면"이라는 뜻이다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = 0;
		
		if(x>0) {
			if(y>0) {
				result = 1;
			}else {
				result = 4;
			}
		}else {
			if(y>0) {
				result = 2;
			}else {
				result = 3;
			}
		}
		System.out.println(result);
	}

}
