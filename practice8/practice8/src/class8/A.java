package class8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A {

	public static void main(String args[]) {
		List list = new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add(1, "Learn");
		list.add(1, "Java");
		printList(list);
	}

	public static void printList(List list) {
		System.out.println("1.==============");
		Iterator it = list.iterator();
		while(it.hasNext() ){
			System.out.println(it.next());
		}
		System.out.println("2.==============");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("3.==============");
		for(Object HLWD: list){
			System.out.println(HLWD);
		}
	}

}
