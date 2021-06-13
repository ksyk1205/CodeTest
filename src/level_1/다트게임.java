package level_1;

import java.util.ArrayList;
import java.util.List;

public class ��Ʈ���� {

	public static void main(String[] args) {
		/*
		���� ����
		��Ʈ ����
		īī���忡 �� �� ��° ��! �ɽ��� ��? īī���� ���Ӻ�~
		Game Star

		īī���� ���Ӻ��� �Ϲݱ� �ű� ���񽺷� ��Ʈ ������ ����ϱ�� �ߴ�. 
		��Ʈ ������ ��Ʈ�ǿ� ��Ʈ�� �� ���� ���� �� ������ �հ�� �Ƿ��� �ܷ�� ��������, ��ΰ� ������ ��� �� �ִ�.
		�� �Ի��� ������ �ڵ� �Ƿ��� �����޾� ������ �ٽ� �κ��� ���� ��� ������ �ð� �Ǿ���. ��Ʈ ������ ���� ��� ������ �Ʒ��� ����.

		1.��Ʈ ������ �� 3���� ��ȸ�� �����ȴ�.
		2.�� ��ȸ���� ���� �� �ִ� ������ 0������ 10�������̴�.
		3.������ �Բ� Single(S), Double(D), Triple(T) ������ �����ϰ� �� ���� ��÷ �� �������� 1����, 2����, 3���� (����1 , ����2 , ����3 )���� ���ȴ�.
		4.�ɼ����� ��Ÿ��(*) , ������(#)�� �����ϸ� ��Ÿ��(*) ��÷ �� �ش� ������ �ٷ� ���� ���� ������ �� 2��� �����. ������(#) ��÷ �� �ش� ������ ���̳ʽ��ȴ�.
		5.��Ÿ��(*)�� ù ��° ��ȸ������ ���� �� �ִ�. �� ��� ù ��° ��Ÿ��(*)�� ������ 2�谡 �ȴ�. (���� 4�� ����)
		6.��Ÿ��(*)�� ȿ���� �ٸ� ��Ÿ��(*)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ��Ÿ��(*) ������ 4�谡 �ȴ�. (���� 4�� ����)
		7/��Ÿ��(*)�� ȿ���� ������(#)�� ȿ���� ��ø�� �� �ִ�. �� ��� ��ø�� ������(#)�� ������ -2�谡 �ȴ�. (���� 5�� ����)
		8/Single(S), Double(D), Triple(T)�� �������� �ϳ��� �����Ѵ�.
		9/��Ÿ��(*), ������(#)�� �������� �� �� �ϳ��� ������ �� ������, �������� ���� ���� �ִ�.
		0~10�� ������ ���� S, D, T, *, #�� ������ ���ڿ��� �Էµ� �� �������� ��ȯ�ϴ� �Լ��� �ۼ��϶�.

		�Է� ����
		"����|���ʽ�|[�ɼ�]"���� �̷���� ���ڿ� 3��Ʈ.
		��) 1S2D*3T

		������ 0���� 10 ������ �����̴�.
		���ʽ��� S, D, T �� �ϳ��̴�.
		�ɼ��� *�̳� # �� �ϳ��̸�, ���� ���� �ִ�.
		��� ����
		3���� ��ȸ���� ���� ���� �հ迡 �ش��ϴ� �������� ����Ѵ�.
		��) 37

		����� ����
		����	dartResult	answer	����
		1	1S2D*3T		37		1��1�� * 2 + 2��2�� * 2 + 3��3��
		2	1D2S#10S	9		1��2�� + 2��1�� * (-1) + 10��1��
		3	1D2S0T		3		1��2�� + 2��1�� + 0��3��
		4	1S*2T*3S	23		1��1�� * 2 * 2 + 2��3�� * 2 + 3��1��
		5	1D#2S*3S	5		1��2�� * (-1) * 2 + 2��1�� * 2 + 3��1��
		6	1T2D3D#		-4		1��3�� + 2��2�� + 3��2�� * (-1)
		7	1D2S3T*		59		1��2�� + 2��1�� * 2 + 3��3�� * 2
		*/ 
		String dartResult = "1S2D*3T";
		int answer = solution(dartResult);
		System.out.println(answer);
		
	}
	public static int solution(String dartResult) {
		int[] dartScore = new int[3];
		int count=0;
		for(int i=0; i<dartResult.length(); i++) {
			int score = Character.getNumericValue(dartResult.charAt(i));
			if(score>0 && score<10 ) {
				if(score == 1 && Character.getNumericValue(dartResult.charAt(i+1))==0) {
					score =10;
					i++;
				}
				dartScore[count++] = score;
			}else {
				char n = dartResult.charAt(i);
				switch(n) {
					case 'S' :
						dartScore[count-1] = (int) Math.pow(dartScore[count-1], 1);
						break;
					case 'D' :
						dartScore[count-1] = (int) Math.pow(dartScore[count-1], 2);
						break;
					case 'T' :
						dartScore[count-1] = (int) Math.pow(dartScore[count-1], 3);
						break;
					case '*' :
						int option = count -1;
						if(option !=0) {
							for(int j=option-1; j<=option; j++) {
								dartScore[j] = dartScore[j] *2;
							}
						}else {
							dartScore[option] = dartScore[option]*2;
						}
						break;
					case '#' :
						dartScore[count-1] = dartScore[count-1] * (-1);
						break;
				}
			}	
		}
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += dartScore[i];
		}
		
		return sum;
    }


}
