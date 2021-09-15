package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. 
 * ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. 
 * "Quadrant n"�� "��n��и�"�̶�� ���̴�.
 * ���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. 
 * �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.

���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.*/

public class ChooseQuadrant {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		if(x>0) {
			if(y>0) {
				System.out.println(1);
			}else {
				System.out.println(4);
			}
		}else {
			if(y>0) {
				System.out.println(2);
			}else {
				System.out.println(3);
			}
		}
				

	}

}
