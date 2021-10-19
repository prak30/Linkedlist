
public class LinkedList {
	Node head;
	Node tail;

	public void show() {
		Node node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.print(node.data);

	}

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtStart(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public void insertInBetween(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (index == 0) {
			insertAtStart(data);
		} else {
			Node n = head;
			for (int i = 0; i < index - 1; i++) {
				n = n.next;
			}
			node.next = n.next;
			n.next = node;

		}
	}


	public Node searchNode(int value) {
		Node n = head;
		int index = 1;
		boolean flag = false;
		if (head == null) {
			System.out.println("empty list");
		} else {
			while (n != null) {
				if (n.data == value) {
					flag = true;
					break;
		}
		index++;
		n = n.next;
			}
		}
		if (flag) {
			System.out.println("Value " + value + " is at " + index);	
		} else {
			System.out.println("element absent");
		}
		return n;
	}

	}
