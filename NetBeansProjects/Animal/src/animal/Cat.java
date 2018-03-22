
package animal;

public class Cat extends Animal {
    public String Name;
    public boolean IsEvil;
    
    public Cat(int age, String color, String breed, String name, boolean isEvil){
        super(age,color, breed);
        this.Name = name;
        this.IsEvil = isEvil;
        System.out.println("A cat named " + name + " has been created");
    }
    
    public void meow(){
        System.out.println("meow meow");
    }
    
}
