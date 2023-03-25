package Generics;

public abstract class Player {

    //private data field
    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
