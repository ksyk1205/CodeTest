package baekJoon.stage.forTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class AplusBminus3 {
	/*
	 * �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է� 
	 * 
	 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
	 * �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
	 * 
	 * ��� 
	 * �� �׽�Ʈ ���̽����� A+B�� ����Ѵ�
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int a=0;
        int b=0;
       
        
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            String sum = Integer.toString(a+b);            
            bw.write(sum+"\n");
                        
        }
        bw.flush();
	}

}
