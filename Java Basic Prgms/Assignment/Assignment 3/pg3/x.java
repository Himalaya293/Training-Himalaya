import java.util.Collections;
import java.util.LinkedList;

class DeleteDuplicates {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(120);
		ll.add(108);
		ll.add(13);
		ll.add(168);
		ll.add(128);
		ll.add(108);
		ll.add(129);
		//ll.clear();
		ll.add(1);
		ll.add(1);
		ll.add(2);
		Collections.sort(ll);
		
		System.out.println("Elements before deletion : "+ll);
		for(int i=0;i<ll.size();i++)
		{
			for(int j=i+1;j<ll.size();j++)
			{
				if(ll.get(i)==ll.get(j))
				{
					ll.remove(ll.get(j));
				}
			}	
		}	
		
		System.out.println("Elements after deletion :"+ll);
	}

}
