package Animal;

public class Animal {
    //age, gender, weight
    
    int age;
    String gender;
    int weight; 
    
    //create a constructor specifically gives the instruction for how a proper animal should come into existence in our program.
   public Animal(int age, String gender, int weight){
       this.age = age;
       this.gender = gender;
       this.weight = weight; 
   } 
   
   public void eat(){
       System.out.println(" Eats ... ");
   }
   
   public void sleep(){
       System.out.println(" .. sleeps... ");
   }
}