package day8;

import java.util.Comparator;

public class MyComparator implements Comparator<Person>{

	@Override
	public int compare(Person p, Person p1) {
		//ʹ���������Ƚ�
		return p.getName().compareTo(p1.getName());
	}

}
