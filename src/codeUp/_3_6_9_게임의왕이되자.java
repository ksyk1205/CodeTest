package codeUp;

import java.util.Scanner;

public class _3_6_9_게임의왕이되자 {
//	친구들과 함께 3 6 9 게임을 하던 영일이는 잦은 실수 때문에 계속해서 벌칙을 받게 되었다.
//	3 6 9 게임의 왕이 되기 위한 369 마스터 프로그램을 작성해 보자.
//
//	** 3 6 9 게임은?
//	여러 사람이 순서를 정한 후, 순서대로 수를 부르는 게임이다.
//	만약 3, 6, 9 가 들어간 수를 자신이 불러야 하는 상황이라면, 수를 부르는 대신 "박수(X)" 를 쳐야 한다.
//	33과 같이 3,6,9가 두 번 들어간 수 일때, "짝짝"과 같이 박수를 두 번 치는 형태도 있다. 
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = stdIn.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i > 10) {
			   int n = i/10;
				if( n==3 || n==6 || n==9) {
				   System.out.print(" 짝 ");
				}else {
					System.out.print(" "+i+" ");
				}
			}else {
				if( i==3 || i==6 || i==9) {
					System.out.print(" 짝 ");
				}else {
					System.out.print(" "+i+" ");
				}
			}
			
		}
		

	}

}
