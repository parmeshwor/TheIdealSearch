package idealSearch;

import java.util.LinkedList;
import java.util.Queue;

public class IdealSearch4 {

	private Node root = new Node();

	public void traverse() {
		
		Queue<Node> li = new LinkedList<>();		
		for(int i=0;i<10;i++)
		li.add(root.arr[i]);
		
		
		while(!li.isEmpty()){
			Node temp = li.remove();
			if(temp!=null){
				if(temp.found)
				System.out.println(temp.data);
			//put all its children in list
				for(int x=0;x<10;x++)
					li.add(temp.arr[x]);
			}			
		}
	}
	
	public void traverseRecursive(){
		
		print_tree(root);
	}
	
	void print_tree(Node root){
		
		if(root==null)
			return;
		
		if(root.found)System.out.println(root.data);
		for(int x=0;x<10;x++){				
			print_tree(root.arr[x]);
		}			
	}

	public void insert(String data) {
		int digitArr[] = IdealSearchHelper.stringToArrayOfInt(data);
		for(int a :digitArr)System.out.print(a);
		System.out.println("---");

		Node temp = root;
		for (int x : digitArr) {
			if (temp.arr[x] == null) {
				temp.arr[x] = new Node();
				temp = temp.arr[x];
			} else {
				temp = temp.arr[x];
			}
		}
		temp.data = data;
		temp.found = true;
		
		System.out.print("SUCCESS : " );
		for(int a : digitArr)System.out.print(a);
		System.out.println();	

	}
	
	public String search(String data){
		int digitArr[] = IdealSearchHelper.stringToArrayOfInt(data);
		int size = digitArr.length-1;
		int count = 0;
		Node temp = root;
	
	while(count<=size&&temp.arr[digitArr[count]]!=null){
		temp = temp.arr[digitArr[count]];
		count++;
		}
		return size+1==count&&temp.found?temp.data:"not found";
	}

	private class Node {

		Node arr[];
		String data;
		boolean found;

		// Node next;
		private Node() {
			
			found = false;
			this.arr = new Node[10];
			for (Node n : arr)
				n = null;
		}
	}
}
