
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

	public void popLast() {
		Node n = head;
		while (n.next.next != null) {
			n = n.next;
		}

		n.next = null;
	}
}
		
//		if (head == null)
//
//            return null;
// 
//
//        if (head.next == null) {
//
//            return null;
//
//        }
// 
//
//        // Find the second last node
//
//        Node second_last = head;
//
//        while (second_last.next.next != null)
//
//            second_last = second_last.next;
// 
//
//        // Change next of second last
//
//        second_last.next = null;
// 
//
//        return head;
//	}
//
//		

