package baekJoon.stage.forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class NumberLessThanX {
	/* 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 
	 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오. 
	 * */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		StringTokenizer str = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
 		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<X) {
				bw.write(arr[i]+" ");
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
