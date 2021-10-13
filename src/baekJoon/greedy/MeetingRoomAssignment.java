package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class MeetingRoomAssignment {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); //���۽ð�
			arr[i][1] = Integer.parseInt(st.nextToken()); //����ð�
		}
		
		//������ �ð��� �������� �����ϱ� ���� compare ������
		Arrays.sort(arr,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) { //����ð��� ���� ��� ���۽ð��� ���� ������
					return o1[0] - o2[0];					
				}
				return o1[1]-o2[1];
			}
		
		});
		
		/*
		 * Arrays.sort(arr, (o1,o2)->{ 
		 *     if(o1[1] == o2[1]){ 
		 *       return o1[0] - o2[0]; 
		 *     }
		 * return o1[1]-o2[1]; 
		 * });
		 */
		
		int cnt = 0;
		int prev_time = 0;
		for(int i=0; i<N; i++) {
			if(prev_time <= arr[i][0]) {
				prev_time = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
				
	}

}
