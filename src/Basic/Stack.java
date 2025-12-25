package Basic;

public class Stack {
	
	private Node head;

	public Stack(Node head) {
		super();
		this.head = head;
	}

	public Stack() {
		super();
	}
	
	public void push(Node newElem) {
		head.setNext(newElem);
		head = newElem;
	}
	
	public Node pop() {
		Node result = head;
		head = head.getNext();
		head.setNext(null);
		return result;
	}
	
	public Node peek() {
		return head;
	}

}
