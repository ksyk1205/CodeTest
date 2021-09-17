package baekJoon.realization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*입력 받은 대로 출력하는 프로그램을 작성하시오.*/

public class Print {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}

	}

}
