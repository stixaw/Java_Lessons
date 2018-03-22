
package animal;

public class Animal {    
    public int Age;
    public String Color;
    public String Breed;
   
    public Animal(int age, String color, String breed){
        this.Age = age;
        this.Color = color;
        this.Breed = breed;
        System.out.println("this "+ Breed + " has been created");     
    }
    
    public int getAge(){
        int result = this.Age;
        return result;
    }
    
    public void setAge(int age){
        this.Age = age;
    }
    
    public void eat(){
        System.out.println("this "+ Breed + " is eating");
    }
    
    public void sleep(){
        System.out.println("this "+ Breed + " is sleeping");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        // all classes inherit from the Object class in java.
        // Object = Superclass, Animal = Subclass
        //Animal animal = new Animal();
        Dog puddi = new Dog(14, "Orange and White","Brittany", "Puddi" );
        puddi.eat();
        puddi.ruff();
        System.out.println(puddi.getAge());
        
        Cat codi = new Cat(5, "black", "siamese", "Stinky", true);
        codi.sleep();
        codi.meow();
        
    }
    
}
