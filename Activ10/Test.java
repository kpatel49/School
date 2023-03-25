

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		MediaHashMap<String, Object> map = new MediaHashMap<String, Object>();
		
		map.put("A", new Media("21", "CNN", "News"));
		map.put("B", new Media("34", "FOX", "News"));
		map.put("C", new Media("42", "NBC", "News"));
		

		map.printMap(map);
		map.remove("C");
		System.out.println("After removing a key");
		map.printMap(map);
	}
	


	

}
