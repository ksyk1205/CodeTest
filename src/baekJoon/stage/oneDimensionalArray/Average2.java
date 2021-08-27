package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average2 {
	/* ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. 
	 * ����� �׵鿡�� ���� ������ �˷���� �Ѵ�. */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		for(int i=0; i<num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int students = Integer.parseInt(st.nextToken());
			int[] arr = new int[students];
			double sum = 0;
			
			for(int j=0; j<arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			double avg = sum/students;
			double cnt = 0;
			
			for(int z=0; z<arr.length; z++) {
				if(arr[z] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n",(cnt/students)*100);
		}
		

	}

}
