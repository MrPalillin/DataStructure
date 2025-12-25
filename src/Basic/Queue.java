package Basic;

public class Queue {
	
	private Node head;
	private Node tail;
	
	public Queue(Node head, Node tail) {
		super();
		this.head = head;
		this.tail = tail;
	}
	public Queue() {
		super();
	}
	
	public void enqueue(Node newNode) {
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.setPrev(newNode);
			tail = newNode;
		}
	}
	
	public Node dequeue() {
		if(head == null) {
			return null;
		}
		Node result = head;
		if(head.getPrev() == null) {
			head = null;
		}else {
			head = head.getPrev();
			head.setPrev(null);
		}
		return result;
	}

}
