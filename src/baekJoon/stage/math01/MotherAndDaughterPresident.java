package baekJoon.stage.math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MotherAndDaughterPresident {
	/*
	 * ��� �ݻ�ȸ�� �����ϴ� ���� �����ϴ� ����� �̹� ��ȸ�� �γ�ȸ���� �ǰ� �;� �� ���� ������� �ҷ� ��� �ݻ�ȸ�� �����Ϸ��� �Ѵ�.
	 * 
	 * �� ����Ʈ�� ���ָ� �Ϸ��� ������ �ִµ�, 
	 * ��a���� bȣ�� ����� �ڽ��� �Ʒ�(a-1)���� 1ȣ���� bȣ���� ������� ���� �ո�ŭ �������
	 * ������ ��ƾ� �Ѵ١� �� ��� ������ �� ��Ű�� ���;� �Ѵ�.
	 * 
	 * ����Ʈ�� ����ִ� ���� ���� 
	 * ��� ���ֹε��� �� ��� ������ ��Ű�� �Դٰ� �������� ��, 
	 * �־����� ���� ���� k�� n�� ���� k����
	 * nȣ���� �� ���� ��� �ִ��� ����϶�. 
	 * 
	 * ��, ����Ʈ���� 0������ �ְ� �������� 1ȣ���� ������,
	 * 0���� iȣ���� i���� ���.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			int k =Integer.parseInt(br.readLine()); //��
			int n =Integer.parseInt(br.readLine()); //ȣ
			
			int[][] arr = new int[15][15];
			for(int j=0; j<arr.length; j++) {
				arr[j][1] = 1; //�� ���� 1ȣ
				arr[0][j] = j; //0�� 
			}
			
			for(int a=1; a<15; a++) {
				for(int b=2; b<15; b++) {
					arr[a][b] = arr[a][b-1] + arr[a-1][b];
				}
			}
			
			System.out.println(arr[k][n]);
			
		}

	}

}
