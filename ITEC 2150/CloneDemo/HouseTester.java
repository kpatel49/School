package CloneDemo;

public class HouseTester {
    public static void main(String[] args) throws CloneNotSupportedException{ //this throws for clone() method
        House house1 = new House(1,1750.50);
        House house2 = (House)house1.clone();

        House house3 = (House)house1.cloneShallow();

        System.out.println("house1 == house2 is " + (house1 == house2));
        System.out.println("house1 == house3 is " + (house1 == house3));

        System.out.println("Deep copy: house1.getWhenBuilt == house2.getWhenBuilt is "
                + (house1.getWhenBuilt() == house2.getWhenBuilt() ));


        System.out.println("Shallow copy: house1.getWhenBuilt == house3.getWhenBuilt is "
                + (house1.getWhenBuilt() == house3.getWhenBuilt() ));


        System.out.println("Deep copy: house1.equals(house2) is " + (house1.equals(house2)));


        System.out.println("Deep copy: house1.getWhenBuilt().equals(house2.getWhenBuilt() is "
                + house1.getWhenBuilt().equals(house2.getWhenBuilt())); //true

    }

}
