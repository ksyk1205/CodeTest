package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*������ 2007�� 1�� 1�� �������̴�. 
�׷��ٸ� 2007�� x�� y���� ���� �����ϱ�? 
�̸� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.*/

public class Year2007 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		int total = 0;
		for(int i=0; i<month-1; i++) {
			total += months[i];
		}
		total+=day;
		
		System.out.println(days[total%7]);
		
	}

}
