package Frozen;

import java.util.ArrayList;
import java.util.List;

public class Elsa implements IRecordKeeperable {

    private String player;
    private int rockPaperScissor; //1 rock 2 paper 3 scissor
    private int points = 0; //1 points per each time of winning

    public Elsa(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public int getRockPaperScissor() {
        return rockPaperScissor;
    }

    public int getPoints() {
        return points;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void setRockPaperScissor(int rockPaperScissor) {
        this.rockPaperScissor = rockPaperScissor;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    //this method store the profile of the player, rockpaperscissor, and current points.
    @Override
    public List<String> profile() {
        List<String> profileList = new ArrayList<String>();
//        profileList.add(0,this.player);
//        profileList.add(1,"" + this.rockPaperScissor);
//        profileList.add(2, ""+ this.points); //this.points is an integer value so it needs to be changed into String.
        profileList.add(this.player);
        profileList.add(""+this.rockPaperScissor); //the reason why you add "" is to make the value as string instead of integer.
        profileList.add(""+ this.points); //this.points is an integer value so it needs to be changed into String.
        return profileList;
    }

    @Override
    public void update(List<String> savedProfile) {
        if(savedProfile != null && savedProfile.size() > 0){
            this.player = savedProfile.get(0);
            this.rockPaperScissor = Integer.parseInt(savedProfile.get(1));
            this.points = Integer.parseInt(savedProfile.get(2)) ; //now convert the string value to an integer value.
        }
    }

    @Override
    public void add(int values) {
        this.points += values;
    }

    @Override
    public String toString() {
        return "Elsa{" +
                "player='" + player + '\'' +
                ", rockPaperScissor='" + rockPaperScissor + '\'' +
                ", points=" + points +
                '}';
    }
}
