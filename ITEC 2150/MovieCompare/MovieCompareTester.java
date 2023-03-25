package MovieCompare;

import java.util.*;

public class MovieCompareTester {
    public static void main(String[] args) {
            ArrayList<Movie> list = new ArrayList<Movie>();

            //Avengers -10,1999, Iron Man -8,2008 , Fight Club - 7.9,1999
            list.add(new Movie("Avengers",8,1999));
            list.add(new Movie("Iron Man",10,2008));
            list.add(new Movie("Fight Club",7.9,1999));

            Collections.sort(list);

        System.out.println("After sorting by Year using the Collections... Make sure check how compareTo method is defined");
        for(Movie movie: list){
            System.out.println(movie.getName() + "  " + movie.getRating() + " " + movie.getYear());
        }

        System.out.println("//////////////Sort by Year released///");
        list.forEach(movie -> System.out.print(movie + " \n")); //based on toString()


        System.out.println("/////// SORT By Ratings  ////////////////// ");

        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list,ratingCompare); //public static <T> void sort(List<T> list, Comparator<? super T> c)

        System.out.println(list);

        System.out.println("//////////////");
        list.forEach(movie -> System.out.print(movie.getRating() + " " + movie.getName() + " " + movie.getYear() + "\n"));

        System.out.println("////////////////SORT BY NAME");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(list,nameCompare);
        System.out.println(list);

    }
}

class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public double getRating(){
        return rating;
    }

    public int getYear(){
        return year;
    }

    @Override
    public int compareTo(Movie m){
        if(this.year > m.year){
            return 1;
        }
        else if(this.year < m.year){
            return -1;

        }
        else return 0;
    }


    @Override
    public String toString(){
        return this.name + ": "  + this.year + ", " + this.rating;
    }

}

class RatingCompare implements Comparator<Movie>{

    public int compare(Movie m1, Movie m2){
        if(m1.getRating() > m2.getRating()){
            return 1;
        }
        else if(m1.getRating() < m2.getRating()){
            return -1;
        }
        else return 0;
    }
}

class NameCompare implements Comparator<Movie>{

    public int compare(Movie m1, Movie m2){
        return m1.getName().compareToIgnoreCase(m2.getName());
    }
}