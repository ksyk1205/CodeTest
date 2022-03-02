package baekJoon.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 밀비급일 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		
		while(true) {
			String s = br.readLine();
			if(s.equals("END")) {
				break;
			}
			
			for(int i=0; i<s.length(); i++) {
				stack.push(s.charAt(i));
			}
			String str = "";
			int size = stack.size();
			for(int i=0; i<size; i++) {
				str+=stack.pop();
			}
			System.out.println(str);
			
		}

	}

}
