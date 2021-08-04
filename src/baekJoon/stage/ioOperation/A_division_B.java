package baekJoon.stage.ioOperation;

import java.util.Scanner;

public class A_division_B {
	/*
	 * A/B 
	 * 첫째 줄에 A/B를 출력한다. 
	 * 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		
		System.out.println(A/B);
	}

}
