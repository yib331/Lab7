import java.util.*;
public class Linked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		list1.add("Tulsa");
		list1.add("Ada");
		list1.add("Broken Arrow");
		list1.add("Owasso");
		list1.add(1, "OKC");
		list2.add("74104");
		list2.add("74135");
		list2.add("foo");
		list2.add("hello world");
		list2.add("777");
		
		ListIterator<String> alter = list2.listIterator();
		LinkedList<String> copy = new LinkedList<String>();
		while(alter.hasNext()) {
		    String next = alter.next();
			list1.add(next);
			copy.add(next);
		}
		System.out.println(list1);
		
		ListIterator<String> alter1 = list1.listIterator();
		
		while(alter1.hasNext()) {
			alter1.next();
			if(alter1.hasNext()) {
				alter1.next();
				alter1.remove();
			}
		}
		System.out.println(list1);
		System.out.println(copy);
		
	}

}
