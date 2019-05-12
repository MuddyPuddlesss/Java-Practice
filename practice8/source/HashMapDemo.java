package day8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,String> hm = new HashMap<String,String>(); 
		hm.put("1", "aaa");
		
		hm.put("2", "bbb");
		hm.put("3", "aaa");
		hm.put("4", "ddd");
		
		//value = get(key) 该方法的作用是通过key返回value
		
		
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();

		while(it.hasNext()){
			String key = it.next();
			String v = hm.get(key);
			System.out.println(key+"::"+v);
		}
	}

}
