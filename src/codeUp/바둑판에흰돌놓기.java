package codeUp;

import java.util.Scanner;

public class �ٵ��ǿ��򵹳��� {
//
//	����� ��Ȱ�� �ϴ� �б����� � �ݿ���(���� �Ͱ���)���� ��� ������ �Ͱ��� �Ѵ�.
//
//	�������� ���� �� �����̴� �ƹ����� �Բ� �δ� �ſ� ū ���� ���ؼ� ������ ���ٰ�
//	"�ٵ��ǿ� ���� �ø� ���� ���α׷��� �� �� ������?"�ϰ� �����Ͽ���.
//
//	�ٵ���(19 * 19)�� n���� �� ���� ���´ٰ� �� ��,
//	n���� �� ���� ���� ��ġ�� ����ϴ� ���α׷��� �ۼ��غ���.
//
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] d = new int[19][19];
		
		for(int i=0; i<n; i++) {
			String[] str = sc.nextLine().split(" ");
			int num1 = Integer.parseInt(str[0]);
			int num2 = Integer.parseInt(str[1]);
			
			d[num1-1][num2-1] = 1;		
		}
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}

	}

}
