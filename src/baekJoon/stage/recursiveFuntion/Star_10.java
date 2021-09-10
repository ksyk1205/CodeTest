package baekJoon.stage.recursiveFuntion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*재귀적인 패턴으로 별을 찍어 보자.
 * N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 
 * 크기 N의 패턴은 N×N 정사각형 모양이다.

크기 3의 패턴은 가운데에 공백이 있고, 
가운데를 제외한 모든 칸에 별이 하나씩 있는 패턴이다.

***
* *
***
N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다. 
예를 들어 크기 27의 패턴은 예제 출력 1과 같다.*/
public class Star_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		char[][] arr = new  char[N][N];
		star(0,0,N,arr);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
	         for(int j=0;j<arr.length;j++) {
	            sb.append(arr[i][j]);
	         }
	         sb.append("\n");
	      }
	     System.out.print(sb);
	}

	private static void star(int x, int y, int size, char[][] arr) {
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if((i >= x+(size/3)) && (i < x+(size/3)+(size/3))
					&& (j >= y+(size/3)) && (j < y+(size/3)+(size/3))) {
					arr[i][j] = ' ';
				}else {
					arr[i][j] = '*';
				}
			}
		}
		if(size == 3) {
			return;
		}
		
		for(int i=x; i<x+size; i+=size/3) {
			for(int j=y; j<y+size; j+=size/3) {
				 if(i == x + size/3 && j == y + size/3) {
		               continue;
		         }
				 star(i,j,size/3,arr);
			}
		}
	}

}
