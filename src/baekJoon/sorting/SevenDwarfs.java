package baekJoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*�պ� ���� �ϰ� �����̵�� �Բ� ��ȭ�Ӱ� ��Ȱ�ϰ� �ִ� �鼳���ֿ��� ���Ⱑ ã�ƿԴ�.
 *�ϰ��� ��ġ�� ���ƿ� �����̰� �ϰ� ���� �ƴ� ��ȩ ���̾��� ���̴�.

��ȩ ���� �����̴� ��� �ڽ��� "�鼳 ���ֿ� �ϰ� ������"�� ���ΰ��̶�� �����ߴ�. �پ ������ �������� ������ �ִ� �鼳���ִ�, ���ེ���Ե� �ϰ� �������� Ű�� ���� 100�� ���� ����� �´�.

��ȩ �������� Ű�� �־����� ��, 
�鼳���ָ� ���� �ϰ� �����̸� ã�� ���α׷��� �ۼ��Ͻÿ�.*/

public class SevenDwarfs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		boolean chk=false;
		for(int i=0; i<arr.length; i++) {
			if(chk) {
				break;
			}
			for(int j=0; j<arr.length; j++) {
				if(i==j) {
					continue;
				}
				if(sum-arr[i]-arr[j]==100) {
					arr[i] = 0;
					arr[j] = 0;
					chk = true;
					break;
				}
			}
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
