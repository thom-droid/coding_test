package ps.programmers.hash.lvl01;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparing {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map1 = new HashMap<>();
//		 
//       map1.put(1, "A");
//       map1.put(2, "B");
//       map1.put(3, "C");
//        
//       //Same keys as map1 
//       HashMap<Integer, String> map2 = new HashMap<>();
//
//       map2.put(3, "C");
//       map2.put(1, "A");
//       map2.put(2, "B");
//        
//       //Different keys than map1
//       HashMap<Integer, String> map3 = new HashMap<>();
//
//       map3.put(1, "A");
//       map3.put(2, "B");
//       map3.put(3, "C");
//       map3.put(3, "D");
//        
//       System.out.println( map1.keySet().equals( map2.keySet() ));  //true
//       System.out.println( map1.keySet().equals( map3.keySet() ));  //false
//       System.out.println(map3.keySet());
		
		HashMap<Integer, String> map1 = new HashMap<>();
		 
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		 
		//Same values as map1
		HashMap<Integer, String> map2 = new HashMap<>();
		 
		map2.put(4, "A");
		map2.put(5, "B");
		map2.put(6, "C");
		 
		//Duplicate values  - C is added twice
		HashMap<Integer, String> map3 = new HashMap<>();
		 
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "C");
		
		System.out.println( new HashSet<>( map1.values() ).equals(new HashSet<>( map2.values() )) );       //true
		System.out.println( new HashSet<>( map1.values() ).equals(new HashSet<>( map3.values() )) ); 
	}
}
