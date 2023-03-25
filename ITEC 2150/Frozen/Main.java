package Frozen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Integer> tournament1ResultList ;
        ArrayList<String> winnerList;
        ArrayList<String> completeResult   = new ArrayList<>();;

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        //you can write the while loop as below or just use quit for iteration
//        int choice = 1;
//        while(choice != 0){
        while(!quit){
            System.out.println("Choose an option: ");
              int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0: quit = true; break;
                case 1:
                tournament1ResultList = readValues();
                winnerList = winnerTeam(tournament1ResultList);


                completeResult.add(winnerList.get(0));
                break;
            }
        }
        System.out.println(completeResult);
    }

    /**
     * readValues()
     * @return
     */
    public static ArrayList<Integer> readValues(){

        ArrayList<Integer> resultList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Anna's team player name");
        String apName = scanner.nextLine();
        System.out.println("Enter Elsa's team player name");
        String epName = scanner.nextLine();

//        IRecordKeeperable ap = new Anna(apName);
//        IRecordKeeperable ep = new Elsa(epName);

        Anna ap = new Anna(apName);
       Elsa ep = new Elsa(epName);

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Ready Set Go! Rock Paper Scissor!");

        int touchPoint = 20;
        int count = 0;
        while(ap.getPoints() < touchPoint && (ep.getPoints() < touchPoint)) {
            ap.setRockPaperScissor ((int)(Math.random() * 3 ) + 1);
            ep.setRockPaperScissor((int)(Math.random() * 3 ) + 1);
            int  annaTeam_result = ap.getRockPaperScissor(); //1 rock 2 paper 3 scissor
            int  elsaTeam_result = ep.getRockPaperScissor(); //1 rock 2 paper 3 scissor
            //1 rock 2 paper 3 scissor
            switch (annaTeam_result) {
                case 1:
                    if (elsaTeam_result == 1) {
                        ap.add(0);
                        ep.add(0);
                        count++;
                        System.out.println(count + ": It is draw");
                    } else if (elsaTeam_result == 2) {
                        ep.add(1);
                        count++;
                        System.out.println(count + ": Elsa team got 1 point");
                    } else {
                        ap.add(1);
                        count++;
                        System.out.println(count + ": Anna team got 1 point");
                    }
                    break;
                case 2:
                    if (elsaTeam_result == 1) {
                        ap.add(1);
                        count++;
                        System.out.println(count + ": Anna team got 1 point");
                    } else if (elsaTeam_result == 2) {
                        ap.add(0);
                        ep.add(0);
                        count++;
                        System.out.println(count + ": It is draw");
                    } else {
                        ep.add(1);
                        count++;
                        System.out.println(count+ ": Elsa team got 1 point");
                    }
                    break;
                case 3:
                    if (elsaTeam_result == 1) {
                        ep.add(1);
                        count++;
                        System.out.println(count + ": Elsa team got 1 point");
                    } else if (elsaTeam_result == 2) {
                        ap.add(1);
                        count++;
                        System.out.println(count + ": Anna team got 1 point");
                    } else {
                        ap.add(0);
                        ep.add(0);
                        count++;
                        System.out.println(count + ": It is draw");
                    }
                    break;
            }
        }
       // System.out.println(ap.toString());
       // System.out.println(((Elsa)ep).toString());
        System.out.println("/////////////////////////");
        saveInformation(ep);
        saveInformation(ap);

        System.out.println("///////////////////////////");

        resultList.add(((Anna)ap).getPoints());
        resultList.add(((Elsa)ep).getPoints());
        return resultList;

//        System.out.println("Result of AP1: " + ap);
//        System.out.println("Result of EP1: " + ep);

        }

    /**
     * winnterTeam() method
     * @param list
     * @return
     */
    //list with point from readValues() method.
       //this method reads integer and then return string value including team name
        public static ArrayList<String> winnerTeam(ArrayList<Integer> list){
        ArrayList<String > winnerList = new ArrayList<>();
        if(list.get(0) > list.get(1)){
            winnerList.add("Anna: " + list.get(0));
        }
        else if(list.get(0) < list.get(1)) {
            winnerList.add("Elsa: " + list.get(1));
        }
        else{
            winnerList.add("Tie");
        }
            return winnerList;
        }

    /**
     * save information
     * @param objectToSave
     */
    public static void saveInformation(IRecordKeeperable objectToSave){
    System.out.println(objectToSave.profile()); //individual profile
    objectToSave.update(objectToSave.profile()); //update those information
    System.out.println(objectToSave); //then printout the each team's defaild profile based on the toString

}
}
