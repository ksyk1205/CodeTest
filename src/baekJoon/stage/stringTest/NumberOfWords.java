package baekJoon.stage.stringTest;

import java.util.Scanner;
import java.util.StringTokenizer;

/*���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. 
 * �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.*/
public class NumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
		

	}

}
