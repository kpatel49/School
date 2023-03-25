package Movie;

public class MovieTester {

    public static void main(String[] args) {
        
        for(int movieNumber = 1; movieNumber <= 5; movieNumber++){
            Movie movie = randomMovie();
            System.out.println("Movie number " + movieNumber + ": " + movie.getName() + '\n'
            + "Plot: " + movie.plot() + '\n');
            
        }
        
    }

    public static Movie randomMovie(){
      int randomRate =  (int)(Math.random() * 5) + 1; //rate between 1 and 5 inclusive. 
        System.out.println("Random Rate: " + randomRate);
        switch(randomRate){
            case 1: 
                return new Intersteller(); //Movie interstellar = new Intersteller(); 
            case 2: 
                return new Jaws();
            case 3:
                return new JohnWick();
            case 4:
                return new TheThing();
            case 5:
                return new ThreeHundred();
        }
       return null; 
    }
    
}

class Movie{
    private String name;//name of a movie

    public Movie(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String plot(){
        return "super clas Movie: Not yet published and actually the storyline has not been written... no plot created. ";
    }

}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A killer shark eats everyone quietly. ";
    }
}

class Intersteller extends Movie{
    public Intersteller(){
        super("Intersteller");
    }

    @Override
    public String plot(){
        return "earth is dying and people go to space to find new planets ";
    }
}


class JohnWick extends Movie{

    public JohnWick(){
        super("John Wick");
    }

    @Override
    public String plot(){
        return "About John Wick and his revenge. ";
    }

}

class ThreeHundred extends Movie{

    public ThreeHundred(){
        super("300");
    }

    @Override
    public String plot(){
        return "300 spartans";
    }
}

class TheThing extends Movie{

    public TheThing(){
        super("The Thing");
    }

    @Override
    public String plot(){
        return "An Alien that can shapeshift into whatever it eats";
    }
}

