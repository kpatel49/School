package ArraysArrayList;

public class ArrayRoster {
    public static void main(String[] args) {
        String[] names = {"Tom", "Allen", "Marcello"};
        StringBuilder roster = new StringBuilder("Roster: ");
        int prefixLength = "Roster: ".length();   //8
        for (String name : names) {
            if (roster.length() >  prefixLength)  // 8 > 8   11 > 8  18 >8
                roster.append(", ");

            
                roster.append(name); //Roster: Tom, Allen, Marcello
            System.out.println(roster);
        }
    }
}