package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*���ڿ� S�� �Է¹��� �Ŀ�, 
 * �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, 
 *  �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
 *  S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.*/

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
