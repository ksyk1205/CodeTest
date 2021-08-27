package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
	/*
	 * �� ���� �ڿ��� A, B, C�� �־��� �� 
	 * A �� B �� C�� ����� ����� 0���� 9���� 
	 * ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ���� ��� A = 150, B = 266, C = 427 �̶�� 
	 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
	 *  ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
	 */	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int num = A*B*C;
		
		int[] arr = new int[10];
		
		while(num>0) {
			int n = num%10;
			num /=10;
			
			arr[n]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
