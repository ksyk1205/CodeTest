package javaAlgorithms.recursiveTreeGraph;


class NodeDFS{
	int data;
	NodeDFS lt, rt;
	public NodeDFS(int val) {
		data = val;
		lt=rt=null;
	}
}
public class ����Ʈ����ȸDFS {
	static NodeDFS root;
	public static void main(String[] args) {
		root = new NodeDFS(1);
		root.lt = new NodeDFS(2);
		root.rt = new NodeDFS(3);
		root.lt.lt = new NodeDFS(4);
		root.lt.rt = new NodeDFS(5);
		root.rt.lt = new NodeDFS(6);
		root.rt.rt = new NodeDFS(7);
		DFS(root);
	}
	private static void DFS(NodeDFS root) {
		if(root == null) {
			return;
		}else {
			//������ȸ���
 			//System.out.print(root.data+" ");
			DFS(root.lt);
			//������ȸ���
			//System.out.print(root.data+" ");
			DFS(root.rt);
			//������ȸ���
			System.out.print(root.data+" ");
		}
		
	}
}
