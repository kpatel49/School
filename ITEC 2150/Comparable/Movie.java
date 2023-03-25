package Comparable;

public class Movie implements Comparable<Movie> {

    private Title title;
    private Rating rating;


    public Movie(Title title, Rating rating) {

        this.title = title;
        this.rating = rating;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public int compareTo(Movie o) {
        //getRating() is from Movie class and getRate() is from Rate class
        // because you need to find integer value to use
        // >  or < =
        if(this.getRating().getRate() > o.getRating().getRate()){
            return 1;
        }
        else if(this.getRating().getRate() < o.getRating().getRate()){
            return -1;
        }
        else return 0;
    }
}
