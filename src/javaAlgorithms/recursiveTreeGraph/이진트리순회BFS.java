package javaAlgorithms.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

class NodeBFS{
	int data;
	NodeBFS lt, rt;
	public NodeBFS(int val) {
		data = val;
		lt = rt = null;
	}
}
public class 이진트리순회BFS {
	static NodeBFS root;
	public static void main(String[] args) {
		root = new NodeBFS(1);
		root.lt = new NodeBFS(2);
		root.rt = new NodeBFS(3);
		root.lt.lt = new NodeBFS(4);
		root.lt.rt = new NodeBFS(5);
		root.rt.lt = new NodeBFS(6);
		root.rt.rt = new NodeBFS(7);
		BFS(root);
	}
	private static void BFS(NodeBFS root) {
		Queue<NodeBFS> que = new LinkedList<>();
		que.offer(root);
		
		while(!que.isEmpty()) {
			int len = que.size();
			int L = 1;
			System.out.print(L+" : ");
			for(int i=0; i<len; i++) {
				NodeBFS cur = que.poll();
				System.out.print(cur.data+" ");
				if(cur.lt!=null) {
					que.offer(cur.lt);
				}
				if(cur.rt!=null) {
					que.offer(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
		
		
	}
}
