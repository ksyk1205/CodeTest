package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ÀÒ¾î¹ö¸°°ýÈ£ {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String[] arr = str.split("-");
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			int plus = 0;
			if(arr[i].contains("+")) {
				String[] s1 = arr[i].split("\\+");
				for(int j=0; j<s1.length; j++) {
					plus += Integer.parseInt(s1[j]);
				}
			}else {
				plus =Integer.parseInt(arr[i]);
			}
			
			if(i==0) {
				sum +=plus;
			}else {
				sum -=plus;
			}
		}
		System.out.println(sum);
	}
}
