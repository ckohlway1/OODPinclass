
public class LinkedList436 {
	private int counter;
	private Node head;
 
	// appends the specified element to the end of this list.
	public void add(Object data) {
			if(head == null) {
				head = new Node(data);
				counter = 1;
				return;
			}
			Node newNode = new Node(data);
			newNode.next = null;
			Node end = head;
			while(end.next != null) {
				end = end.next;
			}
			end.next = newNode;
			counter++;
	}
	
	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		 if(index > counter) {// does the index exist
			 if(index == (counter+1)) {//if it exactly one higher then the list length then it is appending the list and can use the basic add function
				 this.add(data);
			 }
			 return;
		 }
		 
		 Node newNode = new Node(data);
		 Node current = head;
		 for(int i = 0;i < index-1;i++) {//set current to one prior to the target index
			 current = current.next;
		 }
		 newNode.next = current.next;
		 current.next = newNode;
		 counter++;
	}	
	// returns the element at the specified position in this list.
	public Object get(int index)
	{
		Node current = head;
		for(int i = 0;i < index;i++) {
			current = current.next;
		}
		return current.data;
	}
	// removes the element at the specified position in this list.
	public boolean remove(int index) {
		if(index > counter) {//check if the index exists in the list
			return false;
		}
		Node current = head;
		for(int i = 0;i < index - 1;i++) {//move to the node prior to the one to remove
			current = current.next;
		}
		if(current.next == null) {//is there a next
			return false;
		}else if(current.next.next == null) {//is there a node after the one to delete, if so link to the one after
			current.next = null;
			counter--;
			return true;
		}//if the next two exist move to point to skip the toRemove node
		Node toRemove = current.next;
		current.next = toRemove.next;
		counter--;
		return true;
		
		
	}
 
 
	// returns the String content of all the nodes in this list. 
	public String toString() {
		String list = "";
		Node current = head;
		for(int i = 0; i < counter; i++) {
			list = list + current.data + ",";
			current = current.next;
		}
		return list;
	}
 
	// returns the number of elements in this list.
	public int size() {
		return counter;
	}
	
	
	private class Node {
		Node next;
		 
		// data carried by this node. could be of any type you need.
		Object data;
 
		// Node constructor
		public Node(Object dataValue) {
			this.data = dataValue;
			this.next = null;
		// PLEASE INPLEMENT YOUR CODE HERE
		}
 
		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}
 
		public void setData(Object dataValue) {
			this.data = dataValue;
		// PLEASE INPLEMENT YOUR CODE HERE
		}
 		
		// return the next node of the current node
		public Node getNext() {
			return next;
		}
 		
		public void setNext(Node nextValue) {
			this.next = nextValue;
		// PLEASE INPLEMENT YOUR CODE HERE
		}

		// PLEASE FINISH THIS INNER CLASS.
 
	}
}
