
package car;

/**
 *
 * @author Owner
 */
public class Car {
   /** instance Variables**/
    int maxspeed = 100;
    int minspeed = 0;
    
    double weight = 4079;
    
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Lucy";
    
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    
    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 5;
    
    /**Constructor**/
    public Car(int customMinSpeed, int customMaxSpeed){
        minspeed = customMinSpeed;
        maxspeed = customMaxSpeed;
    }
    
    // Getters and Setters
    
    public int getMaxSpeed(){
        int result = this.maxspeed;
        return result;
    }
    
    public void setMaxSpeed(int speed){
        this.maxspeed = speed;
    }
    
    public int getMinSpeed(){
        int result = this.minspeed;
        return result;
    }
    
    public double getWeight(){
        double result = this.weight;
        return result;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public boolean getIsTheCarOn(){
        boolean result = this.isTheCarOn;
        return result;
    }
    
    public void setIsTheCarOn(boolean bool){
        this.isTheCarOn = bool;
    }
    
    public char getCarCondition(){
        char result = this.condition;
        return result;
    }
    
    public void setCarCondition(char grade){
        this.condition = grade;
    }
    
    public String getCarname(){
        String name = this.nameOfCar;
        return name;
    }
    
    public void setCarName(String name){
        this.nameOfCar = name;
    }
    
    public double getMaxFuel(){
        double result = this.maxFuel;
        return result;
    }
    
    public void setMaxFuel(double fuel){
        this.maxFuel = fuel;
    }
    
    public double getCurrentFuel(){
        double result = this.currentFuel;
        return result;
    }
    
    public void setCurrentFuel(double fuel){
        this.currentFuel = fuel;
    }
    
    public double getMpg(){
        double result = this.mpg;
        return result;
    }
    
    public int getNumberOfPeopleInCar(){
        int result = this.numberOfPeopleInCar;
        return result;
    }
    
    public void setNumberOfPeopleInCar(int people){
        this.numberOfPeopleInCar = this.numberOfPeopleInCar + people;
    }
    
    public int getMaxNumberOfPeopleInCar(){
        int result = this.maxNumberOfPeopleInCar;
        return result;
    }
    
    public void setMaxNumberOfPeopleInCar(int people){
        this.maxNumberOfPeopleInCar = people;
    }
    
    public void printVariables(){
        System.out.println("this is the maxspeed " + maxspeed);
        System.out.println("this is the minspeed " + minspeed);
        System.out.println("this is the weight " + weight);
        System.out.println("The Car is on: " + isTheCarOn);
        System.out.println("The Car condition: " + condition);
        System.out.println("We call the car: " + nameOfCar);
        System.out.println("This is the max fuel: " + maxFuel);
        System.out.println("this is the current fuel: " + currentFuel);
        System.out.println("the miles per gallon: " + mpg);
        System.out.println("the people in the car: " + numberOfPeopleInCar);
    }
    
    public void upgradeMaxSpeed(int speed){
        setMaxSpeed(speed);
    }

    public void getIn(){
        //numberOfPeopleInCar = numberOfPeopleInCar + 1;
        if ( getNumberOfPeopleInCar() < getMaxNumberOfPeopleInCar()){
            setNumberOfPeopleInCar(1);
            System.out.println("Somone got in the car");
        }else{
            System.out.println("There are already " + numberOfPeopleInCar + " in the car");
        }       
    }
    public void getOut(){
        //numberOfPeopleInCar = numberOfPeopleInCar -1;
        if (getNumberOfPeopleInCar() > 0){
           setNumberOfPeopleInCar(-1);
        }else{
            System.out.println("There are already " + numberOfPeopleInCar + " in the car");
        }
    }
    
    public double rangeCurrentGas(){
        double result = currentFuel * mpg;
        System.out.println("With the currentFuel: "+ currentFuel +" the rangeMpg you can go is: " + result);
        return result;
    }
    
    public double MaxMilesMaxGas(){
        double result = this.maxFuel * this.mpg;
        System.out.println("Max Fuel: "+ this.maxFuel +" Max MPG: " + result);
        return result;
    }
    
    public void turnTheCarOn(){
        if (!isTheCarOn){
            isTheCarOn = true;
            System.out.println("the car is on");
        }else{
            System.out.println("the car is already on");
        }
    }
    public void turnTheCarOff(){
        if (isTheCarOn){
            isTheCarOn = false;
            System.out.println("the car is off");
        }else{
            System.out.println("the car is already off");
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Car familyCar = new Car();
       // familyCar.printVariables();
       // Car aliceCar = familyCar;
       // aliceCar.changeCarCondition(aliceCar, 'C');
       // familyCar.printVariables();
        
        //Car birthdayPresent = new Car(10, 120);
       // birthdayPresent.printVariables();
        
        Car xmasPresent = new Car(5, 500);
        xmasPresent.rangeCurrentGas();
        xmasPresent.MaxMilesMaxGas();
        xmasPresent.setNumberOfPeopleInCar(4);
        
        xmasPresent.turnTheCarOn();
        xmasPresent.turnTheCarOff();
        xmasPresent.turnTheCarOff();
        xmasPresent.getIn();
        xmasPresent.getIn();
        xmasPresent.getIn();
        xmasPresent.getIn();
        xmasPresent.getOut();
        xmasPresent.printVariables();

    }
    
}
