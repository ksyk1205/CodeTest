package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ºí·Î±×2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		StringTokenizer st1 = new StringTokenizer(input,"B");
		List<String> blist = new ArrayList<>();
		while(st1.hasMoreTokens()){
			blist.add(st1.nextToken());
		}
		
		StringTokenizer st2 = new StringTokenizer(input,"R");
		List<String> rlist = new ArrayList<>();
		while(st2.hasMoreTokens()){
			rlist.add(st2.nextToken());
		}
		
		if(blist.size() >= rlist.size()) {
			System.out.println(rlist.size()+1);
		}else {
			System.out.println(blist.size()+1);
		}
		
	}
}
