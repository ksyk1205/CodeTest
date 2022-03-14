package javaAlgorithms.recursiveTreeGraph;

import java.util.LinkedList;
import java.util.Queue;

class NodeTreeBFS{
	int data;
	NodeTreeBFS lt, rt;
	public NodeTreeBFS(int val) {
		data = val;
		lt=rt= null;
	}
}

public class Tree말단노드까지의가장짧은경로BFS {
	static NodeTreeBFS root;
	public static void main(String[] args) {
		root = new NodeTreeBFS(1);
		root.lt = new NodeTreeBFS(2);
		root.rt = new NodeTreeBFS(3);
		root.lt.lt = new NodeTreeBFS(4);
		root.lt.rt = new NodeTreeBFS(5);
		
		System.out.println(BFS(root));
	}
	private static int BFS(NodeTreeBFS root) {
		Queue<NodeTreeBFS> que = new LinkedList<>();
		que.offer(root);
		
		int Level = 0;
		while(!que.isEmpty()) {
			int Len = que.size();
			for(int i=0; i<Len; ++i) {
				NodeTreeBFS cur = que.poll();
				if(cur.lt==null && cur.rt==null) {
					return Level;
				}
				
				if(cur.lt != null) {
					que.offer(root.lt);
				}
				if(cur.rt != null) {
					que.offer(root.rt);
				}
			}
			Level++;
					
		}
		
		return Level;
	}
}
