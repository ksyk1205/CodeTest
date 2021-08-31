package baekJoon.stage.stringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, 
 * �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
 * ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, 
 * kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, 
 * aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.

�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
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
