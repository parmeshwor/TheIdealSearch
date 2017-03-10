package idealSearch;


public class IdealSearch2 {
	
	private Node root = new Node();

	public void traverse() {
		Node temp = root;
		
		for (int g = 0; g < 10; g++) {
			if (temp.arr[g] == null)
				continue;
			else{
				if(temp.arr[g].found)
					System.out.println(temp.arr[g].data);
			}
			for (int h = 0; h < 10; h++) {
				if (temp.arr[g].arr[h] == null)
					continue;
				else{
					if(temp.arr[g].arr[h].found)
						System.out.println(temp.arr[g].arr[h].data);
				}
				{
					for (int i = 0; i < 10; i++) {
						if (temp.arr[g].arr[h].arr[i] == null)
							continue;
						else{
							if(temp.arr[g].arr[h].arr[i].found)
								System.out.println(temp.arr[g].arr[h].arr[i].data);
						}
						{
							for (int j = 0; j < 10; j++) {
								if (temp.arr[g].arr[h].arr[i].arr[j] == null)
									continue;
								else{
									if(temp.arr[g].arr[h].arr[i].arr[j].found)
										System.out.println(temp.arr[g].arr[h].arr[i].arr[j].data);
								}
							}
						}
					}
				}
			}
		}
	}

	public void insert(int data) {
		int digitArr[] = IdealSearchHelper.integerToArray2(data);

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
	
	public int search(int data){
		int digitArr[] = IdealSearchHelper.integerToArray(data);
		int size = digitArr.length-1;
		int count = 0;
		Node temp = root;
	
	while(count<=size&&temp.arr[digitArr[count]]!=null){
		temp = temp.arr[digitArr[count]];
		count++;
		}
		return size+1==count&&temp.found?temp.data:-1;
	}

	private class Node {

		Node arr[];
		int data;
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
