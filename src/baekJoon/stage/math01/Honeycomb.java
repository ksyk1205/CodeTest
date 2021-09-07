package baekJoon.stage.math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {
	/*
	 * ���� �׸��� ���� ���������� �̷���� ������ �ִ�. 
	 * �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� 
	 * �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�.
	 * ���� N�� �־����� ��, ������ �߾� 1���� N�� ����� 
	 * �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	 * ���� ���, 13������ 3��, 58������ 5���� ������.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int count = 1;
		int range = 2;
		
		if(N == 1) {
			System.out.println(1);
		}else {
			while(range<=N) {
				range = range + (6*count);
				count++;
			}
			System.out.println(count);
		}
		
		
		
	}

}
