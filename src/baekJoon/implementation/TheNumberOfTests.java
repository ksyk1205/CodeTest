package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*��ǻ�͸� �����ϴ� ȸ���� KOI ���ڿ����� �����ϴ� ��ǻ�͸��� 6�ڸ��� ������ȣ�� �ű��. 
 *������ȣ�� ó�� 5�ڸ����� 00000���� 99999������ �� �� �ϳ��� �־����� 6��° �ڸ����� �������� ����. 
 *�������� ������ȣ�� ó�� 5�ڸ��� ���� 5���� ���ڸ� ���� ������ ���� ���� 10���� ���� �������̴�.

���� ��� ������ȣ�� ó�� 5�ڸ��� ���ڵ��� 04256�̸�, 
�� ���ڸ� ������ ������ �� 0+16+4+25+36 = 81 �� 10���� ���� �������� 1�� �������̴�.*/

public class TheNumberOfTests {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double n1 = Integer.parseInt(st.nextToken());
		double n2 = Integer.parseInt(st.nextToken());
		double n3 = Integer.parseInt(st.nextToken());
		double n4 = Integer.parseInt(st.nextToken());
		double n5 = Integer.parseInt(st.nextToken());
		
		n1 = Math.pow(n1, 2);
		n2 = Math.pow(n2, 2);
		n3 = Math.pow(n3, 2);
		n4 = Math.pow(n4, 2);
		n5 = Math.pow(n5, 2);
		
		int sum = (int) (n1+n2+n3+n4+n5);
		
		System.out.println(sum%10);

	}

}
