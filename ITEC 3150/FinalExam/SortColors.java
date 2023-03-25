

import java.util.LinkedList;
import java.util.Collections;

public class SortColors{

    public static void main(String[] args){
    	LinkedList<Color> lst = new LinkedList<Color>();

    	lst.add(new Color(2,5,3));
		lst.add(new Color(3,1,4));
		lst.add(new Color(2,4,5));
		lst.add(new Color(2,5,2));

		System.out.println(lst);

		Collections.sort(lst, new Color());
		System.out.println(lst);

    }
}

//ADM