package baekJoon.stage.stringTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*������� ���� ����� ������ ���� ���Ѵ�. 
 * ����� ���ڸ� �дµ� ������ �ִ�. 
 * �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
 * ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. 
 * �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.

����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. 
���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
 ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.

�� ���� �־����� ��, 
����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Sangsu {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
		System.out.println(A>B?A:B);
	}

}
