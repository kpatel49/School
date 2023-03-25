package ArraysArrayList;

import java.util.ArrayList;

public class ArrayListRoster {

	  public static void main(String[] args) {

	    //String[] names = {"Tom", "Allen", "Marcello"};
	    ArrayList<String> names = new ArrayList<>();
	    names.add("Tom"); names.add("Allen"); names.add("Marcello");
	    
	    StringBuilder roster = new StringBuilder("Roster: ");
	    int prefixLength = "Roster: ".length();

	    // visit each list item with traditional for loop
	    for (int i = 0; i < names.size(); i++) {
	        if (roster.length() >  prefixLength) roster.append(", ");
	        roster.append(names.get(i));
	    }
	    System.out.println(roster);

	    // visit each list item with enhanced for loop
	    roster = new StringBuilder("Roster: ");
	    for (String name : names) {
	        if (roster.length() > prefixLength) roster.append(", ");
	        roster.append(name);
	    }
	    System.out.println(roster);
	  }
	}
