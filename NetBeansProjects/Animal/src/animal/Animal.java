package animal;

public abstract class Animal {

    public int Age;
    public String Color;
    public String Genus;
    public String Type;
    public Boolean IsCarnivore;

    public Animal(int age, String color, String genus) {
        this.Age = age;
        this.Color = color;
        this.Genus = genus;
        System.out.println("An animal has been created");
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        int result = this.Age;
        return result;
    }

    public void setIsCarnivore(boolean isCarnivore) {
        this.IsCarnivore = isCarnivore;
    }

    public boolean getIsCarnivore() {
        boolean result = this.IsCarnivore;
        return result;
    }

    public void climbs() {
        System.out.println("climbing animals are fun");
    }

    public abstract void eat();

    public abstract void sleep();

    public static void main(String[] args) {
        // TODO code application logic here
        // all classes inherit from the Object class in java.
        // Object = Superclass, Animal = Subclass
        //Animal animal = new Animal();
        Dog dog1 = new Dog(14, "Orange and White", "Canis", "Brittany", "Puddi");
        dog1.eat();
        dog1.ruff();
        System.out.println(dog1.getAge());

        Cat cat1 = new Cat(5, "black", "Felis", "Stinky", "siamese", true);
        cat1.sleep();
        cat1.meow();

        // casting
        Object dogO = new Dog(5, "Black", "Canis", "Husky", "Blake");
        Dog dog2 = (Dog) dogO;
        dog2.setIsCarnivore(true);
        dog2.ruff();

        //what if?
        Dog doggy = new Dog(5, "Black", "Canis", "Mutt", "Sgt Stinky");
        if (doggy instanceof Animal) {
            Animal animal1 = (Animal) doggy;
            animal1.sleep();
        }
        doggy.run();

    }

}
