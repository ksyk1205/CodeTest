package baekJoon.stage.stringTest;

import java.util.Scanner;

/*N���� ���ڰ� ���� ���� �����ִ�. 
 * �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class NumPlus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		int sum=0;
		for(int i=0; i<n; i++){
			// charAt() �� �ش� ������ �ƽ�Ű�ڵ� ���� ��ȯ�ϹǷ� 
			// �ݵ�� -48 �Ǵ� -'0' �� ���־�� 
			//�츮�� �Է¹��� ���� �� �״�θ� ����� �� �ִ�.
			sum += str.charAt(i)-48;
		}
		System.out.println(sum);
	}

}
