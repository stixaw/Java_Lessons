package animal;

public class Dog extends Animal {

    public String Name;
    public String Breed;

    public Dog(int age, String color, String genus, String breed, String name) {
        super(age, color, genus); // reference the Animal constructor.
        this.Name = name;
        this.Breed = breed;
        System.out.println("A dog named " + Name + " has been created");
    }

    public void ruff() {
        System.out.println("Bark Bark");
    }

    public void run() {
        System.out.println(this.Name + " is running");
    }
     
    public void sleep(){
        System.out.println("The dog named " + this.Name + " is sleeping");
    }
    
    public void eat(){
         System.out.println("The dog named " + this.Name + " is eating");
    }

}
