package codeUp;

import java.util.Scanner;

public class ������������ {
//	����(red), �ʷ�(green), �Ķ�(blue) ���� ���� ���� ���� �ٸ� �� ���� ����� ������ �Ѵ�.
//
//	����(r), �ʷ�(g), �Ķ�(b) �� ���� �������� �־��� ��,
//	�־��� rgb ������ ���� ���� �� �ִ� ��� ����� ����(r g b)�� ���� �� �ִ� ���� ���� ���� ����غ���.  
//
//	**�����, ����Ʈ���� ���� ���÷��̿��� �� �ȼ��� ���� ������ ���ؼ� r, g, b ���� ������ �� �ִ�.
//	**�ȼ�(pixel)�� �׸�(picture)�� �����ϴ� ��(cell)���� �̸��� ���������.
//	�Է� ����   
//	2 2 2
//
//	��� ����
//	0 0 0
//	0 0 1
//	0 1 0
//	0 1 1
//	1 0 0
//	1 0 1
//	1 1 0
//	1 1 1
//	8
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] str = stdIn.nextLine().split(" ");
		int red = Integer.parseInt(str[0]);
		int green = Integer.parseInt(str[1]);
		int blue = Integer.parseInt(str[2]);
		int cnt = 0;
		for(int i=0; i<red; i++) {
			for(int j=0; j<green; j++) {
				for(int z=0; z<blue; z++) {
					System.out.println(i+" "+j+" "+z);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
