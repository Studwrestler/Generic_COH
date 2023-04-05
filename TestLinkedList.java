/**
 * This is the test class where we will test our linked list
 * @author Chase
 * Project 3
 */
public class TestLinkedList {
	/**
	 * Default
	 */
	TestLinkedList(){
		
	}
/**
 * Main loop of application
 * @param args arguments of main method
 */

	public static void main(String[]args) {
		GenericLinkedList<Integer> IntList = new GenericLinkedList<Integer>();

		GenericNode<Integer> aNode = new GenericNode<Integer>();
		aNode.setData(1);
		IntList.addNode(aNode);
		aNode = new GenericNode<Integer>();
		aNode.setData(2);
		IntList.addNode(aNode);

		GenericNode<Integer> tempnode = IntList.getList();
		do {
			System.out.println(tempnode.getData());
			tempnode = tempnode.getNextNode();
		} while (tempnode != null);
		
		
		GenericLinkedList<Double> DoubList = new GenericLinkedList<Double>();
		GenericNode<Double> aNode2 = new GenericNode<Double>();
		aNode2.setData(1.5);
		DoubList.addNode(aNode2);
		aNode2 = new GenericNode<Double>();
		aNode2.setData(2.5);
		DoubList.addNode(aNode2);

		GenericNode<Double> tempnode2 = DoubList.getList();
		do {
			System.out.println(tempnode2.getData());
			tempnode2 = tempnode2.getNextNode();
		} while (tempnode2 != null);
		
		GenericLinkedList<String> StrList = new GenericLinkedList<String>();
		GenericNode<String> aNode3 = new GenericNode<String>();
		aNode3.setData("Hi");
		StrList.addNode(aNode3);
		aNode3 = new GenericNode<String>();
		aNode3.setData("Dr. Johnson");
		StrList.addNode(aNode3);

		GenericNode<String> tempnode3 = StrList.getList();
		do {
			System.out.println(tempnode3.getData());
			tempnode3 = tempnode3.getNextNode();
		} while (tempnode3 != null);
		
		
	}//end main

}//end class
