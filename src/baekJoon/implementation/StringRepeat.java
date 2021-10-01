package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*문자열 S를 입력받은 후에, 
 * 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 *  즉, 첫 번째 문자를 R번 반복하고, 
 *  두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. 
 *  S에는 QR Code "alphanumeric" 문자만 들어있다.

QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.*/

public class StringRepeat {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			for(int j=0; j<S.length(); j++) {
				for(int z=0; z<R; z++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
	
		}

	}

}
