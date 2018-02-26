package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;

    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        setMax(100);
        setTheNumber();
    }

    public int getTheNumber() {
        int result = this.theNumber;
        return result;
    }

    public void setTheNumber() {
        Random rand = new Random();
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public int getMax() {
        int result = this.max;
        return result;
    }

    public void setMax(int x) {
        this.max = x;
    }

    public void play() {
        int totalGuesses = 0;
        while (true) {
            System.out.println("Guess the number!");
            int guess = scanner.nextInt();
            if (guess > theNumber) {
                System.out.println("To Large");
                totalGuesses++;
            } else if (guess < theNumber) {
                System.out.println("To Small");
                totalGuesses++;
            } else {
                System.out.println("Thats it!");
                System.out.println(String.format("You guessed it in %d guesses!", totalGuesses));
                totalGuesses++;
                break;
            }
        }
    }

    public static void HowBigIsYourNumber(int x) {
        if (x >= 0 && x <= 10) {
            System.out.println(String.format("Your Number: %d is pretty small", x));
        } else if (x >= 11 && x <= 100) {
            System.out.println(String.format("Your Number: %d is pretty big", x));
        } else {
            System.out.println(String.format("Your Number: %d is larger than 100", x));
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner reader = new Scanner(System.in);
        //System.out.println("Enter a number");
        //int num = reader.nextInt();
        //HowBigIsYourNumber(num);
        //reader.close();

        GuessTheNumber number = new GuessTheNumber();
        number.play();

    }

}
