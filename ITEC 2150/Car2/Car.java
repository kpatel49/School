package Car2;

public class Car {
    
    //door, wheels, model, color
    
    private int door;
    private int wheels;
    private String model;
    private String color;

    
    public void setModel(String model){
  
        String modelName = model.toLowerCase();
        
        if(modelName.equals("mustang") || modelName.equals("camry")){
           this.model = model; 
        }
        else{
            this.model = "unknown... "; 
        }
    }
    
    public String getModel(){
        return this.model; 
    }
}