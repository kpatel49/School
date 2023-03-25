package Comparable;

public class MovieTester {
    public static void main(String[] args) {
//        Title title;
//        Rating rating;
        Movie starWars = new Movie(new Title("Star Wars"), new Rating(5.0));
        Movie galaxyQuest = new Movie(new Title("Galaxy Quest"), new Rating(4.5));

        int result = starWars.compareTo(galaxyQuest);
        System.out.println(result);
    }
}
