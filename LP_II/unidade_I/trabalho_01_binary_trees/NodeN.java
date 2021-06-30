import java.util.Stack;

public class NodeN {

	public int value;

	Stack<NodeN> childs = new Stack<NodeN>();
	
	public Stack<NodeN> getChilds() {
		return childs;
	}
	
	public void setChilds(Stack<NodeN> childs) {
		this.childs = childs;
	}

	public NodeN(int value, int n) {
		this.value = value;
		this.childs.setSize(n);

	}

	public String toString() {
		return Integer.toString(value);
	}
	
}