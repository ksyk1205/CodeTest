package codeUp;

import java.util.Scanner;

public class �ٵϾ˽��ڵ����� {
//	�θ���� ��ٸ��� �����̴� ����/�� �� �ٵϾ��� �ٵ��ǿ� �� ä�� ��� ���� ��ٰ�...
//
//	"��(+)�� �����⸦ �غ���?"�ϰ� �����ߴ�.
//
//	���� �������
//	�� ��ġ�� �ִ� ��� ������ ���� ���� �ݴ�(1->0, 0->1)�� �ٲ� ��, 
//	�ٽ� �� ��ġ�� �ִ� ��� ������ ���� ���� �ݴ�� �ٲٴ� ���̴�.
//	� ��ġ�� ��� ���� �����⸦ �ϸ�, �� ��ġ�� ������ �����ٰ� �������� ���� ��� �ݴ�� �ٲ��.
//
//	�ٵ���(19 * 19)�� �� ��(1) �Ǵ� ���� ��(0)�� ��� �� ä���� �������� ��,
//	n���� ��ǥ�� �Է¹޾� ��(+)�� �������� ����� ����ϴ� ���α׷��� �ۼ��غ���.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] d = new int[19][19];
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			for(int j=0; j<d.length; j++) {
				if(d[x][j] == 0) {
					d[x][j] = 1;
				}else {
					d[x][j] = 0;
				}
			}
			
			for(int z=0; z<d.length; z++) {
				if(d[z][y] == 0) {
					d[z][y] = 1;
				}else {
					d[z][y] = 0;
				}
			}
		}
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d.length; j++) {
				System.out.print(d[i][j] + "");
			}
			System.out.println();
		}
		
		
	}

}
