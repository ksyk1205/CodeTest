package baekJoon.realization;

import java.util.Scanner;

/*���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, 
 * �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
 * ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class FindAlphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(char c ='a'; c<='z'; c++) {
			System.out.print(str.indexOf(c)+" ");
		}
		
	}

}
