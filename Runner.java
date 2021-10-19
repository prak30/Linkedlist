
public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node newNode = new Node();
		newNode.data = 40;
		list.insert(56);
		list.insert(30);
		list.insert(70);
		System.out.println("before adding");
		list.show();
		list.searchNodeAt(30,newNode);
		System.out.println("\n" +"after adding");
		list.show();
	
	
		
	}

}
