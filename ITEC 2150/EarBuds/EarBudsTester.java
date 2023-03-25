package EarBuds;

import java.util.Scanner;
public class EarBudsTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //polymorphism

        Buds airpodspro = new AirpodPro(0,true,false);
        Buds echobuds = new EchoBuds(10,true,false,"Blue",true);

        System.out.println("My AirPodPro status: " + airpodspro.toString());
        System.out.println("My EchoBuds status: " + echobuds.toString());

        if(airpodspro instanceof AirpodPro) {
            ((AirpodPro) airpodspro).noiseCancellationOn();
            ((AirpodPro)airpodspro).callSiri();
        }

        System.out.println("What can I do for you... 1 for noise cancellation on, 2 for volume up, 3 for turn off");
        int yourInput = input.nextInt();

        if(yourInput == 1){
            ((AirpodPro) airpodspro).noiseCancellationOn();
        }
        if(yourInput == 2){
            airpodspro.volumeUp();
        }
        if(yourInput == 3 ){
            airpodspro.turnOff();
        }

        System.out.println("My AirPodPro current status: :" + airpodspro.toString());
        //    System.out.println("My EchoBud current status: " + echobud.toString());

        //or without instanceof as below
        ((EchoBuds) echobuds).setAssistant(true);
        if(((EchoBuds) echobuds).isAssistant()) {
            ((EchoBuds) echobuds).callAlexa();
        }
        System.out.println("What can I do for you? Ask questions in a setence." );
        String yourQuestion = input.nextLine();
        input.next();
        System.out.println("Hmmmm... I don't get that. I haven't learn to answer to your question. Sorry. ");
        System.out.println("If you want to learn more about how to use echo, go to setting and change the setting. ");
        System.out.println("Instead, I will change the color of the echo ring");
        ((EchoBuds) echobuds).setColor("Margenta");
        System.out.println("Here are the current status of Echo: " + echobuds.toString());

        //Bonus points opportunity:  revise this main methods more interactively to communicate either with Siri or Alexa.

    }
}
