package programers.level_1;

import java.util.Scanner;

public class ���簢������� {

	public static void main(String[] args) {
		/*
		���� ����
		�� �������� ǥ�� �Է����� �� ���� ���� n�� m�� �־����ϴ�.
		��(*) ���ڸ� �̿��� ������ ���̰� n, ������ ���̰� m�� ���簢�� ���¸� ����غ�����.

		���� ����
		n�� m�� ���� 1000 ������ �ڿ����Դϴ�.
		����
		�Է�

		5 3
		���

		*****
		*****
		*****
		*/
		
		Scanner sc = new Scanner(System.in);
        
		int m = sc.nextInt(); //���α���(��)
		int n = sc.nextInt(); //���α���(��)
        
        
       for(int i=0; i<m; i++) {
    	   for(int j=0; j<n; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
        
	}

}
