package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� 
 *������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.

X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class FindFractionalNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		int sum = 0;
		int first = 0;
		int index = 0;
		
		for(int i=1; i<=X; i++) {
			sum += i;
			if(sum >= X) { 
				first = sum-(i-1);
				index = i;
				break;
			}
		}
		
		for(int j=1; j<=index; j++) {
			if(first == X) {
				
				if(index%2==0) {
					System.out.println(j+"/"+(index-j+1));
				}else {
					System.out.println((index-j+1)+"/"+j);
				}
				break;
			}
			first++;
		}

	}
}
