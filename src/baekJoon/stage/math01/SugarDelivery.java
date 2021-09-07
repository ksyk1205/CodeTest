package baekJoon.stage.math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery {
	/*
	 * ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. 
	 * ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
	 * �������忡�� ����� ������ ������ ����� �ִ�. 
	 * ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
	 * 
	 * ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
	 * ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 
	 * 3ų�α׷� ���� 6���� �������� ������, 
	 * 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, 
	 * �� ���� ������ ������ ����� �� �ִ�.
	 * 
	 * ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, 
	 * ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int max = N/5;
		
		int result = -1;
		
		for(int i = max; i>=0; i--) {
			if((N-(i*5))%3==0) {
				result = i+((N-(i*5))/3);
				break;
			}
		}
		
		System.out.println(result);
		
	}

}
