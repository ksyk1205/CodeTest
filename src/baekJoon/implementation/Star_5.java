package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*ù° �ٿ��� �� 1��, ��° �ٿ��� �� 3��, ..., N��° �ٿ��� �� 2��N-1���� ��� ����

���� ����� �������� ��Ī�̾�� �Ѵ�.*/

public class Star_5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=N-1; i>=0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<2*(N-i)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
