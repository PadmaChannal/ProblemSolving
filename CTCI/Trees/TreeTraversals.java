
class Node {
	int data;
	Node left, right;
	
	Node (int n){
		this.data = n;
		this.left = null;
		this.right =null;
	}
}

public class TreeTraversals {
	
	public static void main(String[] args) {
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(8);
		
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		
		root.right.left = new Node(7);
		root.right.right = new Node(9); 
		
		System.out.println("PreOrder Display");
		preOrder(root);
		System.out.println("\nInOrder Display");
		InOrder(root);
		System.out.println("\nPostOrder Display");
		postOrder(root);
		
		
	}
	
	static void preOrder(Node n) {
		
		if(n ==null){
			return;
		}
		
		System.out.print(n.data + " ");
		preOrder(n.left);
		preOrder(n.right);
	}
	
	static void InOrder(Node n) {
		
		if(n ==null){
			return;
		}
		InOrder(n.left);
		System.out.print(n.data + " ");
		InOrder(n.right);
	}
	
	static void postOrder(Node n) {
		
		if(n ==null){
			return;
		}
		
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data + " ");
	}

}
