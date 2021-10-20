
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
	
	public int findSize() {
		Node node = head;
		int count = 1;
		while (node.next != null) {
			count++;
			node = node.next;
		}
		return count;
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

	public Node searchNodeAt(int value, Node newNode) {
		Node tempNode = head;
		if (head == null) {
			System.out.println("empty list");
		} else {
			while (tempNode != null) {
				if (tempNode.data == value) {
					break;
				}
				tempNode = tempNode.next;
			}
			Node tempNodeNext = tempNode.next;
			tempNode.next = newNode;
			newNode.next = tempNodeNext;
		}
		return tempNode;
	}

	public void deleteNode(int value)
	{
		if(this.head == null)
		{
			System.out.println("list is empty");
		}
		Node tempNode = head;
		while(tempNode.next.data != value)
		{
			tempNode = tempNode.next;
		}
		Node previousNode = tempNode;
		Node nextNode = tempNode.next.next;
		previousNode.next = nextNode;
		}
	}