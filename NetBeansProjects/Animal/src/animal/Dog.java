
package animal;

public class Dog extends Animal {
    public String Name;

     
    public Dog(int age, String color, String breed, String name){
        super(age, color, breed); // reference the Animal constructor.
        this.Name = name;
        System.out.println("A dog named " + Name + " has been created");
    }
    
    public void ruff(){
        System.out.println("Bark Bark");
    }
    
    public void run(){
        System.out.println(Name + " is running");
    }
    
}
