package javaAlgorithms.sortingSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Point implements Comparable<Point> {
	int x;
	int y; 
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x ==o.x) {
			return this.y-o.y;
		}
		return this.x-o.x;
		
	}
	
}

public class ÁÂÇ¥Á¤·Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Point> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			list.add(new Point(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(list);
		
		for(Point point : list) {
			System.out.print(point.x+" "+point.y+"\n");
		}
		
	}
}
