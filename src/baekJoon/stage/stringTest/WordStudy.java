package baekJoon.stage.stringTest;

import java.util.Scanner;

public class WordStudy {
	/*
	 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
	 * �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ�
	 * �ҹ��ڸ� �������� �ʴ´�.
	 * 
	 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�.
	 *  ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase();
		
		int[] alphabet = new int[26];
		for(int i=0; i<str.length(); i++) {
			int n = str.charAt(i)-'A';
			alphabet[n]++;
		}
		int max = 0;
		char answer ='?';
		for(int i=0; i<alphabet.length; i++) {
			if(max<alphabet[i]) {
				max = alphabet[i];
				answer = (char)(i+'A');
			}else if(max == alphabet[i]) {
				answer = '?';
			}
		}
		
		System.out.println(answer);
		
	}

}
