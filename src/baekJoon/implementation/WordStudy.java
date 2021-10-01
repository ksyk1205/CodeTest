package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * 
 * ���
ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.*/

public class WordStudy {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		
		int[] alpha = new int[26];
		for(int i=0; i<str.length(); i++) {
			int num = str.charAt(i)-'A';
			alpha[num]++;
		}
		int max = 0;
		char answer = '?';
		
		for(int i=0; i<alpha.length; i++) {
			if(max<alpha[i]) {
				max = alpha[i];
				answer = (char) (i+'A');
			}else if(max==alpha[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
		
		
	}

}
