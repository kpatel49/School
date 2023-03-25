package Final;


import java.util.ArrayList;

public abstract class ILearn {
    private String learning_method;



    public ILearn(String learning_method) {
    	this.learning_method = "learn from " + learning_method;
    	if(learning_method == "my mistakes") {
    		this.learning_method = "Learing from " + learning_method + " is hard";
    	}
    }

// Complete this class constructor here so that the program shows the output as shown above. (5 points)  YOU MUST ONLY COMPLETE THE CONSTRUCTOR.

//YOU CANNOT CHANGE ANY OTHER METHOD.  YOU WON"T GET POINT.
     


    public void print() {
        System.out.println("I " + learning_method + ".");
    }
}

class InClass extends ILearn {
    public InClass() {
        super("school classes");
    }
}

class Experience extends ILearn {
    public Experience() {
        super("my experience");
    }
}

class Lessons extends ILearn {
    public Lessons() {
        super("lessons");
    }
}

class Mistakes extends ILearn {
    public Mistakes() {
        super("my mistakes") ;
    }



// Complete this class so that the output shows “Learning from my mistakes is hard.”  Please remember Mistakes class is inherited from ILearn class and ILearn class is an abstract class. (5 points)

 

 


}

class Poly {
    public static void main(String args[]) {
        ArrayList<ILearn> learns = new ArrayList<ILearn>();
        learns.add(new InClass());
        learns.add(new Experience());
        learns.add(new Lessons());
        learns.add(new Mistakes());
        learns.add(new Textbook());

        for (int i = 0; i < learns.size(); i++) {
            learns.get(i).print();
        }
    }
}

class Textbook extends ILearn {

    public Textbook() {

        super("textbook");

    }


   
    public void print(String s) {
    	
    	// System.out.println("I learn from " + s + ".");
         
    //Complete this method here to generate the output as below in         
        //green font when you run this entire package. To be able to see the output as the 
    //sample run, you also must complete next task question (5 points)
//this method must be based on the previous question. Remember you cannot change
//print() method from the ILearn class. 
                   
 
    }

}