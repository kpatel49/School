package ExceptionHandlingDemo;

public class NullPointerExceptionDemoTester {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

class Printer{

    private String name; //default value of string instance value is null.

    public void setName(String name){
        this.name = name;
    }

    public void print(){
        //printString(name);
//        if(name == null){
//            printString("");
//        }else{
//            printString(name);
//        }

 //       printString(name == null ? "": name);

        try{
            printString(name);
        }catch(NullPointerException npe){
            System.out.println(npe);
            name = "";
            printString(name);
        }

    }

    private void printString(String str){
        System.out.println(str + "(" + str.length() + ")");

    }
}