package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 주유소 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//거리입력
		int[] length = new int[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<length.length; i++) {			
			length[i] = Integer.parseInt(st.nextToken());
		}
		
		//기름값
		int[] gas = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<gas.length; i++) {
			gas[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		
		int min= gas[0];
		for(int i=0; i<N-1; i++) {
			if(min>gas[i]) {
				min = gas[i];
			}
			sum += min*length[i];			
		}
		System.out.println(sum);
	}
}
