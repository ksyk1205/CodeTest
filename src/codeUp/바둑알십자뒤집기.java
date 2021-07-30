package codeUp;

import java.util.Scanner;

public class 바둑알십자뒤집기 {
//	부모님을 기다리던 영일이는 검정/흰 색 바둑알을 바둑판에 꽉 채워 깔아 놓고 놀다가...
//
//	"십(+)자 뒤집기를 해볼까?"하고 생각했다.
//
//	십자 뒤집기는
//	그 위치에 있는 모든 가로줄 돌의 색을 반대(1->0, 0->1)로 바꾼 후, 
//	다시 그 위치에 있는 모든 세로줄 돌의 색을 반대로 바꾸는 것이다.
//	어떤 위치를 골라 집자 뒤집기를 하면, 그 위치를 제외한 가로줄과 세로줄의 색이 모두 반대로 바뀐다.
//
//	바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
//	n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] d = new int[19][19];
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			for(int j=0; j<d.length; j++) {
				if(d[x][j] == 0) {
					d[x][j] = 1;
				}else {
					d[x][j] = 0;
				}
			}
			
			for(int z=0; z<d.length; z++) {
				if(d[z][y] == 0) {
					d[z][y] = 1;
				}else {
					d[z][y] = 0;
				}
			}
		}
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d.length; j++) {
				System.out.print(d[i][j] + "");
			}
			System.out.println();
		}
		
		
	}

}
