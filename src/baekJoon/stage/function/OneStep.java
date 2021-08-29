package baekJoon.stage.function;

import java.util.Scanner;
/*
 * 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고,
 * N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
 */
public class OneStep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int n = OneStep(num);
		System.out.println(n);
	}

	private static int OneStep(int num) {
		if(num<100) {
			return num;
		}else {
			if(num == 1000) {
				num = 999;
			}
			int result = 99;
			for(int i=100; i<=num; i++) {
				int n1 = i/100%10;
				int n2 = i/10%10;
				int n3 = i%10;
				
				if(n2*2==n1+n3) {
					result++;
				}
			}
			return result;
		}
	}

}
