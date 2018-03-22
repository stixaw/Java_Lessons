package animal;

public class Cat extends Animal {

    public String Name;
    public String Breed;
    public boolean IsEvil;

    public Cat(int age, String color, String genus, String name, String breed, boolean isEvil) {
        super(age, color, genus);
        this.Name = name;
        this.Breed = breed;
        this.IsEvil = isEvil;
        System.out.println("A cat named " + name + " has been created");
    }

    public void meow() {
        System.out.println("meow meow");
    }
    
    public void climbs(){
        System.out.println(this.Name + "is climbing the tree");
    }
    
    public void sleep(){
        System.out.println("The cat named " + this.Name + " is sleeping");
    }
    
    public void eat(){
         System.out.println("The cat named " + this.Name + " is eating");
    }

}
