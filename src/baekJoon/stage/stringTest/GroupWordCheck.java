package baekJoon.stage.stringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 
 * 각 문자가 연속해서 나타나는 경우만을 말한다. 
 * 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
 * kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
 * aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/
public class GroupWordCheck {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = 0;
		for(int i=0; i<n; i++) {
			if(check(br.readLine())) {
				result++;
			}
		}
		System.out.println(result);
	}

	private static boolean check(String str) {
		Stack<Character> st = new Stack<>();
		st.add(str.charAt(0));
		
		for(int i=1; i<str.length(); i++) {
			if(st.peek() == str.charAt(i)) {
				continue;
			}else {
				if(st.contains(str.charAt(i))) {
					return false;
				}else {
					st.add(str.charAt(i));
				}
			}
		}
		
		return true;
	}

}
