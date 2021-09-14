package baekJoon.stage.math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Snail {
	/*
	 * �� ���� �����̰� �ִ�. 
	 * �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
	 * 
	 * �����̴� ���� A���� �ö� �� �ִ�. 
	 * ������, �㿡 ���� �ڴ� ���� B���� �̲�������. 
	 * ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
	 * 
	 * �����̰� ���� ���븦 ��� �ö󰡷���,
	 * ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		int day = 0;
		day = (V-B)/(A-B);
		if((V-B)%(A-B) != 0) {
			day++;
		}
		System.out.println(day);
		
		
	}

}