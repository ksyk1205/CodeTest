package baekJoon.stage.oneDimensionalArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Average2 {
	/* 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 
	 * 당신은 그들에게 슬픈 진실을 알려줘야 한다. */
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
