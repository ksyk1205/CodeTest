package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 폴리오미노 {
	static String str;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = br.readLine();
		sb = new StringBuilder();
		
		solution();
		
		System.out.print(sb.toString());
		
	}
	private static void solution() {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c=='X') {
				result += c;
			}else if(c=='.') {
				
				if(result.length() %2 !=0) {
					sb.setLength(0);
					sb.append("-1");
					return;
				}
				
				result = result.replaceAll("XXXX", "AAAA").replaceAll("XX", "BB");
				sb.append(result+".");
				result = "";
			}
		}
		
		if(result.length()>0) {
			if(result.length() %2 !=0) {
				sb.setLength(0);
				sb.append("-1");
				return;
			}
			
			result = result.replaceAll("XXXX", "AAAA").replaceAll("XX", "BB");
			sb.append(result);
		}
	}
}
