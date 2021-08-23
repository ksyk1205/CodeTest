package baekJoon.stage.whileTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/
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
