package baekJoon.stage.math01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;



/*����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� A�� B�� �־�����. (0 < A,B < 1010000)

���
ù° �ٿ� A+B�� ����Ѵ�.
*/
public class BigNumberAB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A =  new BigInteger(st.nextToken());
		BigInteger B =  new BigInteger(st.nextToken());
		
		A = A.add(B);
		
		System.out.println(A.toString());
	}

}
