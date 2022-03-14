package javaAlgorithms.recursiveTreeGraph;

class NodeTreeDFS{
	int data;
	NodeTreeDFS lt, rt;
	public NodeTreeDFS(int val) {
		data = val;
		lt = rt = null;
	}
}

public class Tree말단노드까지의가장짧은경로DFS {
	static NodeTreeDFS root;
	public static void main(String[] args) {
		root = new NodeTreeDFS(1);
		root.lt = new NodeTreeDFS(2);
		root.rt = new NodeTreeDFS(3);
		root.lt.lt = new NodeTreeDFS(4);
		root.lt.rt = new NodeTreeDFS(5);
		
		System.out.println(DFS(0, root));
		
	}
	private static int DFS(int L, NodeTreeDFS root) {
		if(root.lt ==null && root.rt == null) {
			return L;
		}else {
			return Math.min(DFS(L+1, root.lt) , DFS(L+1, root.rt));
		}
	}
}
