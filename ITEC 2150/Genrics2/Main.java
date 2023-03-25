package Genrics2;


/**
 Copy everything from the step 4 to new package.
 We will work on comparing each team’s achievement by using Comparable Interface.
 Go to Team and implements Comparable<Team<T>> and we will define compareTo()
 And Go to Main… and follow the direction and call compareTo() methods between
 two teams and so on.  This is part of the Collections.sort(..)

 */
public class Main {
    public static void main(String[] args) {

        Leagues<Team<SoccerPlayer>> soccerLeague = new Leagues<>("United Soccer League");

        //now we are going to add more players for each type of sport
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer cole = new FootballPlayer("Cole");
        FootballPlayer matthew = new FootballPlayer("Matthew");
        FootballPlayer chelsie = new FootballPlayer("Chelsie");
        FootballPlayer zane = new FootballPlayer("Zane");



        BaseballPlayer pat = new BaseballPlayer("Pat");
        BaseballPlayer bob = new BaseballPlayer("Bob");
        BaseballPlayer chuck = new BaseballPlayer("Chuck");

        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        SoccerPlayer messi = new SoccerPlayer("Messi");
        SoccerPlayer zidane = new SoccerPlayer("Zidane");
        SoccerPlayer maradona = new SoccerPlayer("Maradona");
        SoccerPlayer jisungPark = new SoccerPlayer("Park Jisung");



        Team<FootballPlayer> falcons = new Team<FootballPlayer>("Atlanta Falcons");
        falcons.addPlayer(joe);
        falcons.addPlayer(chelsie);


        Team<FootballPlayer> steelers = new Team<FootballPlayer>("Pittsburgh Steelers");
        steelers.addPlayer(cole);
        steelers.addPlayer(zane);

        Team<FootballPlayer> vikings = new Team<FootballPlayer>("Minnesota Vikings");
        vikings.addPlayer(matthew);

        Team<BaseballPlayer> cubs = new Team<BaseballPlayer>("Cubs");
        Team<BaseballPlayer> redsox = new Team<BaseballPlayer>("Red Sox");
        Team<BaseballPlayer> braves = new Team<BaseballPlayer>("Braves");
        braves.addPlayer(bob);
        redsox.addPlayer(pat);
        cubs.addPlayer(chuck);

        Team<SoccerPlayer> united = new Team<SoccerPlayer>("Atlanta United");
        Team<SoccerPlayer> fcBarcelona = new Team<SoccerPlayer>("FC Barcelona");
        Team<SoccerPlayer> manchester = new Team<SoccerPlayer>("Manchester");
        united.addPlayer(zidane);
        united.addPlayer(messi);
        manchester.addPlayer(jisungPark);
        manchester.addPlayer(beckham);
        fcBarcelona.addPlayer(maradona);


        soccerLeague.add(manchester);
        soccerLeague.add(fcBarcelona);
        soccerLeague.add(united);

        united.matchResult(fcBarcelona,10,5);
        united.matchResult(manchester,10,9);

        braves.matchResult(redsox,20,10);
        braves.matchResult(cubs,25,10);


        System.out.println("Rankings");
        System.out.println(united.getTeamName() + ": " +  united.ranking());
        System.out.println(fcBarcelona.getTeamName() +  ": " + fcBarcelona.ranking());
        System.out.println(manchester.getTeamName() + ": " + manchester.ranking());


        System.out.println(braves.getTeamName() + ": " +  braves.ranking());
        System.out.println(redsox.getTeamName() +  ": " + redsox.ranking());
        System.out.println(cubs.getTeamName() + ": " + cubs.ranking());

        System.out.println(braves.compareTo(redsox));
        System.out.println(braves.compareTo(cubs));

        soccerLeague.showLeagueTable();

    }
}
