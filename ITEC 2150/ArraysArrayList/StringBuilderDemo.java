package ArraysArrayList;

public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(8);
       // System.out.println(sb);
        sb.append(9);
    //    System.out.println(sb);
        sb.append(6);
     //   System.out.println(sb);
    //    System.out.println(sb.append("Hello"));
      System.out.println(sb.append(3.4));
         sb.insert(2,"Brad");
       System.out.println(sb);
       sb.replace(1,3,"NULL VALUE");
        System.out.println(sb);

    }
}
