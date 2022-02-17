package prob6;

//Show the methods are not threadsafe.
//Then modify so that they are threadsafe.
public class Queue {
	class Node {
		Object value;
		Node next;

		@Override
		public String toString() {
			return "Node{" +
					"value=" + value +
					", next=" + next +
					'}';
		}
	}
	private Node head;
	private Node tail;
	int size;
	public void add(Object newValue) {
		Node n = new Node();
		if(head == null) head = n;
		else tail.next = n;
		tail = n;
		tail.value = newValue;
		size++;
	}
	public Object remove() {
		if(head == null) return null;
		Node n = head;
		head = n.next;
		return n.value;
	}

	@Override
	public String toString() {
		return "Queue{" +
				"head=" + head +
				", tail=" + tail +
				'}';
	}
}