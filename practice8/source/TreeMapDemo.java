package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<String,String> hm = new TreeMap<String,String>(); 
		hm.put("1", "aaa");
		hm.put("2", "bbb");
		hm.put("3", "aaa");
		hm.put("4", "ddd");
		
		//value = get(key) �÷�����������ͨ��key����value
		
		
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext()){
			String key = it.next();
			String v = hm.get(key);
			System.out.println(key+"::"+v);
		}

	}

}
