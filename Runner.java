
public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(56);
		list.insert(30);
		list.insert(70);
		list.show();
		System.out.println();
		list.popLast();
	
		System.out.println("Final seq");
		list.show();
		
	}

}
