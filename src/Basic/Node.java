package Basic;

public class Node {
	
	private Value<?> value;
	private Node next;
	private Node prev;
	
	public Node(Value<?> value, Node next, Node prev) {
		super();
		this.value = value;
		this.next = next;
		this.prev = prev;
	}

	public Node(Value<?> value) {
		super();
		this.value = value;
	}

	public Node() {
		super();
	}

	public Value<?> getValue() {
		return value;
	}

	public void setValue(Value<?> value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	

}
