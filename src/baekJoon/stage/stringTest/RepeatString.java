package baekJoon.stage.stringTest;

import java.util.Scanner;

/*���ڿ� S�� �Է¹��� �Ŀ�, 
 * �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, 
 *  �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. 
 *  S���� QR Code "alphanumeric" ���ڸ� ����ִ�.

QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
*/
public class RepeatString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			for(int j=0; j<str.length(); j++) {
				for(int z=0;z<n;z++) {
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

	}

}
