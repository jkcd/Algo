package list;
public class LinkedList {

	private Node head = null;

	static class Node {
		private int data;
		private Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	// get head node
	Node getHead() {
		return head;
	}

	// print the list
	void printNodes() {
		for (Node node = head; node != null; node = node.next) {
			System.out.println("data: " + node.data);
		}
	}

	// inserting a node at the beginning of the list
	void insertAtTheFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	// insert after data
	void insertAfter(int afterData, int data) {
		Node newNode = new Node(data);
		Node node = null;
		for (node = head; (node != null && node.data != afterData); node = node.next)
			;
		if (node == null) {
			System.out.println("data: " + afterData + " is not in the list");
		} else {
			newNode.next = node.next;
			node.next = newNode;
		}

	}

	// insert node at the end
	void insertNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node node;
			for (node = head; node.next != null; node = node.next)
				;
			node.next = newNode;
		}
	}

	// print the list in reverse order
	void printReverse(Node head) {
		if (head == null)
			return;
		printReverse(head.next);
		System.out.println("data: " + head.data);

	}

	public static void main(String[] args) {

		LinkedList llist = new LinkedList();

		llist.insertAfter(1, 100);
		llist.printNodes();
		System.out.println("==========");

		llist.insertNode(1);
		llist.insertNode(2);
		llist.insertNode(3);
		llist.insertNode(4);
		llist.printNodes();
		System.out.println("==========");

		llist.insertAtTheFront(0);
		llist.printNodes();
		System.out.println("==========");

		llist.insertAfter(2, 20);
		llist.printNodes();
		System.out.println("==========");

		llist.insertAfter(6, 60);
		llist.printNodes();
		System.out.println("==========");

		llist.printReverse(llist.getHead());
		System.out.println("==========");

	}

}
