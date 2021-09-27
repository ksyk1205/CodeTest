package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. 
 * �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. 
 * c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.

1���� 8���� ���ʴ�� �����Ѵٸ� ascending,
 8���� 1���� ���ʴ�� �����Ѵٸ� descending,
 �� �� �ƴ϶�� mixed �̴�.

������ ������ �־����� ��, 
�̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class MusicalScales {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(str.equals("1 2 3 4 5 6 7 8")) {
			System.out.println("ascending");
		}else if(str.equals("8 7 6 5 4 3 2 1")) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}

}
