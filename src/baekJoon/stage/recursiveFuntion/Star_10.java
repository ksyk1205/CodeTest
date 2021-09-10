package baekJoon.stage.recursiveFuntion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*������� �������� ���� ��� ����.
 * N�� 3�� �ŵ�����(3, 9, 27, ...)�̶�� �� ��, 
 * ũ�� N�� ������ N��N ���簢�� ����̴�.

ũ�� 3�� ������ ����� ������ �ְ�, 
����� ������ ��� ĭ�� ���� �ϳ��� �ִ� �����̴�.

***
* *
***
N�� 3���� Ŭ ���, ũ�� N�� ������ �������� ä���� ����� (N/3)��(N/3) ���簢���� ũ�� N/3�� �������� �ѷ��� �����̴�. 
���� ��� ũ�� 27�� ������ ���� ��� 1�� ����.*/
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
