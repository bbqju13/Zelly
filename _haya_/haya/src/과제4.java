import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class 과제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]=new String[] {"a", "e", "f"};
		String arr2[]=new String[] {"d", "b", "c"};
		
		ArrayList<String>list=new ArrayList<String>();
		
		for(String tmp:arr) {
			list.add(tmp);
		}
		for(String tmp:arr2) {
			list.add(tmp);
		}

		Collections.sort(list);
		Iterator<String>iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}

}
