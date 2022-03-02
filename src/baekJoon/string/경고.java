package baekJoon.string;

import java.util.Scanner;

public class °æ°í {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String startT = sc.next();
		String endT = sc.next();
		
		solution(startT, endT);
	}

	private static void solution(String startT, String endT) {
		
		if(startT.equals(endT)) {
			System.out.println("24:00:00");
		}else {
			int h = Integer.parseInt(endT.split(":")[0]) - Integer.parseInt(startT.split(":")[0]);
			int m = Integer.parseInt(endT.split(":")[1]) - Integer.parseInt(startT.split(":")[1]);
			int s = Integer.parseInt(endT.split(":")[2]) - Integer.parseInt(startT.split(":")[2]);
			
			if(s<0) {
				s+=60;
				m--;
			}
			
			if(m<0) {
				m+=60;
				h--;
			}
			
			if(h<0) {
				h+=24;
			}
			
			System.out.format("%02d:%02d:%02d", h, m, s);
		}
		
		
	}
}
