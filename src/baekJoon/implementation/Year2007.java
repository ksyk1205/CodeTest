package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*오늘은 2007년 1월 1일 월요일이다. 
그렇다면 2007년 x월 y일은 무슨 요일일까? 
이를 알아내는 프로그램을 작성하시오.*/

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
