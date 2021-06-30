import java.util.Stack;

public class TreeN {

	public NodeN root;
	public int n;

	public TreeN(int value, int n){
		root = new NodeN(value, n);
		Stack<NodeN> childs = new Stack<NodeN>();
		
		for(int i=0; i<n; i++) {
			
			childs.add(new NodeN(i, n));
	
		}
		
		root.setChilds(childs);
		
	}

	public void levelOrder() {
		Stack<NodeN> P = root.getChilds();
		P.add(root);
		int i=0;
		while (!P.isEmpty()) {
			NodeN current = P.pop();
			if (current != null) {
				System.out.println(current + "(" + i +")");
			}
			i++;
		}
	}
}