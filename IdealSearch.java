package idealSearch;

/**
 * Created by parmeshwor on 1/23/16.
 */
public class IdealSearch {

	private Node root = new Node();

	public void traverse() {
		Node temp = root;

		for (int g = 0; g < 10; g++) {
			if (temp.arr[g] == null)
				continue;
			for (int h = 0; h < 10; h++) {
				if (temp.arr[g].arr[h] == null)
					continue;
				{
					for (int i = 0; i < 10; i++) {
						if (temp.arr[g].arr[h].arr[i] == null)
							continue;
						{
							for (int j = 0; j < 10; j++) {
								if (temp.arr[g].arr[h].arr[i].arr[j] == null)
									continue;
								else {
									System.out.print("" + g + h + i + j);
									System.out.println();
								}
							}
						}
					}
				}
			}
		}
	}

	public void insert(int data) {
		int digitArr[] = IdealSearchHelper.integerToArray(data);

		Node temp = root;
		for (int x : digitArr) {
			if (temp.arr[x] == null) {
				temp.arr[x] = new Node();
				temp = temp.arr[x];
			} else {
				temp = temp.arr[x];
			}
		}
		System.out.print("SUCCESS : " );
		for(int a : digitArr)System.out.print(a);
		System.out.println();
			

	}
	
	public boolean search(int data){
		int digitArr[] = IdealSearchHelper.integerToArray(data);
		
		try{
			if(root.arr[digitArr[0]].arr[digitArr[1]].arr[digitArr[2]].arr[digitArr[3]]!=null)
				return true;
		}catch(Exception e){
		}
		return false;
	}

	private class Node {

		Node arr[];

		// Node next;
		private Node() {
			this.arr = new Node[10];
			for (Node n : arr)
				n = null;
		}
	}
}
