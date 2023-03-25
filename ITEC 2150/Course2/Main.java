package Course2;

import java.util.concurrent.TimeUnit;
public class Main  {
    public static void main(String[] args) throws InterruptedException {
        Course c1 = new Course("Intermediate Programming");
        Course c2 = new Course("Advanced Programming");

        c1.addStudent("Clifford");
        c1.addStudent("Kris");
        c1.addStudent("Marco");
        c1.addStudent("Kush");

        c2.addStudent("Anthony");
        c2.addStudent("Brad");
        c2.addStudent("Bouba");

        System.out.println("number of students in course 1: " + c1.getNumberOfStudents());
        System.out.println("List of students in course 1: " + c1.getStudents());

        System.out.println("number of students in course 2: " + c2.getNumberOfStudents());
        System.out.println("List of students in course 2: " + c2.getStudents());

        TimeUnit.SECONDS.sleep(2);

        System.out.println("Now you can add more students to course 1 - ITEC 2150 ");
        System.out.println("How many do you want to add? Must be higher than 0. ");

        java.util.Scanner input = new java.util.Scanner(System.in);
        int num = input.nextInt();

        do{
        if(num < 0){
            System.out.println("You must enter number higher than 0. ");
            System.out.println("How many do you want to add? Must be higher than 0");
            num = input.nextInt();
        }
        }while(num <= 0);

        System.out.println("Great job! Wait for 10 seconds to receive the next task.");

        TimeUnit.SECONDS.sleep(10);

        System.out.println("You can enter names now ");
        //we will come back to here
        input.nextLine();
        for(int i = 0; i < num; i++){
            c1.addStudent(input.nextLine());
        }
        System.out.println(c1.getStudents());

        System.out.println("Great job!!! Please wait for 10 seconds to receive the next task. ");
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Now you will remove the first student of the ITEC 2150. ");
        System.out.println("Please wait another 10 seconds....");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("Drop the first student's name from ITEC 2150 - please type the student's name to drop.");
        String nameToDrop = input.nextLine();

        c1.dropStudent(nameToDrop);

        TimeUnit.SECONDS.sleep(10);

        System.out.println("Student list of ITEC 2150 is " + c1.getStudents());

    }
}
