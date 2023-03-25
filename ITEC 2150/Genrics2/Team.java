package Genrics2;

import java.util.ArrayList;

/**

 Copy everything from the step 4 to new package.
 We will work on comparing each team’s achievement by using Comparable Interface.
 Go to Team and implements Comparable<Team<T>> and we will define compareTo()
 And Go to Main… and follow the direction and call compareTo() methods between
 two teams and so on.  This is part of the Collections.sort(..)


 */
public class Team<T extends Player>  implements  Comparable<Team<T>>{

    int played = 0;//how many numbers have this team played against its opponent team
    int won = 0;
    int lost = 0;
    int tied = 0;
    //data field
    private String teamName;
    private ArrayList<T> members = new ArrayList<T>();

    //constructor
    public Team(String teamName){
        this.teamName = teamName;
    }

    public String getTeamName(){
        return teamName;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName() + " is already on this team. ");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.teamName);
            return true;
        }
    }


    public int numPlayer(){
        return this.members.size();
    }

    public void matchResult(Team<T> opponentTeamObject, int ourScore, int opponentTeamScore){
        if(ourScore > opponentTeamScore){
            won++;
        }
        else if(ourScore == opponentTeamScore){
            tied++;
        }
        else{
            lost++;
        }
        played++; //increase the number of games played

        //null means that the object variable has not set a value.
        if(opponentTeamObject != null){
            opponentTeamObject.matchResult(null,opponentTeamScore,ourScore);
            //we can update the opponent's score.  we put null at this time, so this does not get executed again.
            //so this way, we are actually saving our results for our team but also saving the results in the
            //opponent's team as well saving the results in their ...  object .. king of separate object.
            //

        }
    }

    //ranking method is going to return ranking points.
    //the rule of getting the points is that the number of winning will be mutiplied by 10 points.
    //for example, if we won 3 times, then 3 * 10, and then that points will be add tied points.

    public int ranking(){
        return (won * 10 ) + tied;
    }

    @Override
    public int compareTo(Team<T> team){
        if(this.ranking() > team.ranking()){
            return 1;
        }
        else if(this.ranking() < team.ranking()){
            return -1;
        }
        else return 0;
    }
}