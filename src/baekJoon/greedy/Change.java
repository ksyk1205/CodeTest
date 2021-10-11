package baekJoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Ÿ�δ� ���� JOI��ȭ������ ������ ���. 
 * JOI��ȭ������ �ܵ����� 500��, 100��, 50��, 10��, 5��, 1���� ����� �ְ�, 
 * ������ �Ž����� ������ ���� ���� �ܵ��� �ش�. 
 * Ÿ�ΰ� JOI��ȭ������ ������ ��� ī���Ϳ��� 1000�� ���� ���� ���� ��, 
 * ���� �ܵ��� ���Ե� �ܵ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Change {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = 1000-Integer.parseInt(br.readLine());
		
		int[] arr = {500,100,50,10,5,1};
		int cnt = 0;

		for(int i=0; i<arr.length; i++) {
			cnt += money/arr[i];
			money%=arr[i];
		}
		
		System.out.println(cnt);

	}

}
