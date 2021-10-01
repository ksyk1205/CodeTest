package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. 
 * O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 * ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. 
 * ���� ���, 10�� ������ ������ 3�� �ȴ�.

"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.

OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class OXQuiz {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		
		for(int i=0; i<C; i++) {
			String str = br.readLine();
			int sum = 0;
			int cnt = 0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					cnt++;
					sum += cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(sum);
		}

	}

}
