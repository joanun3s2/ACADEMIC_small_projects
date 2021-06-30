import java.util.LinkedList;
import java.util.Stack;

public class Tree {

	public Node root;
	
	// Construtor personalizado para receber a matricula como entrada para a questão 05
	public Tree(int mat[]) {
		
		Node node1 = new Node(mat[0]);
		Node node2 = new Node(mat[1]);
		Node node3 = new Node(mat[2]);
		Node node4 = new Node(mat[3]);
		Node node5 = new Node(mat[4]);
		Node node6 = new Node(mat[5]);
		Node node7 = new Node(mat[6]);
		Node node8 = new Node(mat[7]);
		Node node9 = new Node(mat[8]);
		Node node10 = new Node(mat[9]);
		Node node11 = new Node(mat[10]);
		
		this.root = node6;
		node6.setChilds(node4, node10);
		node4.setChilds(node2, node5);
		node10.setChilds(node8, node11);
		node2.setChilds(node1, node3);
		node8.setChilds(node7, node9);
		
	}
	
	// Construtor padrão para a questão 06
	public Tree() {
		Node node1 = new Node(2);
		Node node2 = new Node(0);
		Node node3 = new Node(6);
		Node node4 = new Node(7);
		Node node5 = new Node(4);
		Node node6 = new Node(1);
		Node node7 = new Node(0);
		Node node8 = new Node(5);
		Node node9 = new Node(3);
		Node node10 = new Node(2);
		Node node11 = new Node(2);
		
		
		
		this.root = node1;
		
		node1.setChilds(node3, node2);
		node3.setChilds(node4, node5);
		node2.setChilds(node6, node7);
		node5.setChilds(node8, node9);
		node7.setChilds(node10, node11);
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root != null) {
			System.out.print(root);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root);
			inOrder(root.right);
		}
	}

	public void posOrder() {
		posOrder(root);
	}

	private void posOrder(Node root) {
		if (root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.print(root);
		}
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			Node current = queue.removeFirst();
			if (current != null) {
				System.out.println(root);
				queue.addLast(current.left);
				queue.addLast(current.right);
			}
		}
	}
	
	public String toString() {
		
		printRecursivo(root, 0);
		return "";
		
	}
	
	private String printRecursivo(Node root, int level) {
		
		if (root != null) {
			printRecursivo(root.left, level + 1);
			printLevel(root, level, 1);
			//level = level - 1;
			printRecursivo(root.right, level + 1);
		}
		
		return "";
	}
	
	private void printLevel(Node root, int level, int cont) {
		System.out.print("	");
		if(level < 1) {
			System.out.println(root + " [Level:" + cont +"]");
			return;
		}
		
		System.out.print(" ");
		printLevel(root, level-1, cont+1);
		
	}
	
	
	// Alterações fetias pela questao 07.
	@Override
	public boolean equals(Object obj){ 
		
		if(this == obj)
			return true;
		
		if(obj == null || obj.getClass() != this.getClass())
			return false;
	
		Tree tree = (Tree)obj;
		
		return compare(this.root, tree.root);
	}
	
	public boolean compare(Node atual, Node t_atual){ 
		if(atual.value == t_atual.value){
			
			if((atual.hasLeft() == true) && (t_atual.hasLeft() == true)){
				
				if((atual.hasRight() == true) && (t_atual.hasRight() == true)){
					
					if(compare(atual.left, t_atual.left) == true)
						
						return compare(atual.right, t_atual.right); 
					else
						return false;
					
				}
				
				else if((atual.hasRight() == false) && (t_atual.hasRight() == false))
					return compare(atual.left, t_atual.left); 
				else
					return false;
			}
			
			else if((atual.hasRight() == true) && (t_atual.hasRight() == true)){
				
				if(atual.hasLeft() == t_atual.hasLeft())
					return compare(atual.right, t_atual.right); 
				else
					return false;
			}
			else if((atual.isLeaf() == true) && (t_atual.isLeaf() == true))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public void add(int value){ 
		
		Node node = new Node(value);
		if(root == null){
			this.root = node;
		}
		else{
			Node a = this.root;
			while(true){
				if(node.value < a.value){
					if(a.left != null){
						a = a.left;
					}
					else{
						a.left = node;
						break;
					}
				}
				else{
					if(a.right != null){
						a = a.right;
					}
					else{
						a.right = node;
						break;
					}
				}
			}
		}
	}
	
	// Alterações feitas para a questao 10.
	public void levelOrderStack(){ 
		
		Stack<Node> P = new Stack<Node>(); 
		Node N = root;
		
		while(!P.isEmpty()){
			while(N != null){
				P.add(N.right); 
				P.add(N);
				N = N.left; 
			}
			
			Node T = P.pop(); 
			N = T; 
			Node F = N.right; 
			
			if((F != null) && (F == P.peek())){
				Node temp = P.pop(); 
				P.add(N); 
				N = temp; 
			}else{
				System.out.println(N); 
				N = null; 
			}
		}
	}
}
