package baekJoon.stage.whileTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class AplusB2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a,b; 
		String input;
		while((input = br.readLine())!=null) {
			 StringTokenizer st = new StringTokenizer(input);
			 
			 a = Integer.parseInt(st.nextToken());
			 b = Integer.parseInt(st.nextToken());
			 System.out.println(a+b);
			 
		 }
	}

}
