package madlibs;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String story;
    String name;
    String adjective1;
    String adjective2;
    String noun1;
    String noun2;
    String noun3;
    String adverb;
    String randomNums;

    //getters
    public String getStory() {
        String result = this.story;
        return result;
    }

    public String getName() {
        String result = this.name;
        return result;
    }

    public String getAdjective1() {
        String result = this.adjective1;
        return result;
    }

    public String getAdjective2() {
        String result = this.adjective2;
        return result;
    }

    public String getNoun1() {
        String result = this.noun1;
        return result;
    }

    public String getNoun2() {
        String result = this.noun2;
        return result;
    }

    public String getNoun3() {
        String result = this.noun3;
        return result;
    }

    public String getAdverb() {
        String result = this.adverb;
        return result;
    }

    public String getRandomNums() {
        String randomNum = this.randomNums;
        return randomNum;
    }

    //setters
    public void setStory(String story) {
        this.story = story;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdjective1(String adject1) {
        this.adjective1 = adject1;
    }

    public void setAdjective2(String adject2) {
        this.adjective2 = adject2;
    }

    public void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    public void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    public void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    public void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    public void setRandomNums() {
        int num = Math.abs(random.nextInt()) % 100;
        int index = 0;
        int[] numberHolder = new int[3];
        while (index < numberHolder.length) {
            numberHolder[index] = num + index;
            index++;
        }
        randomNums = "not " + numberHolder[0] + ", not " + numberHolder[1]
                + ", but " + numberHolder[2];

    }

    // Print instructions to Player 
    public void printInstructions() {
        System.out.println("Welcome to the MadLibs game.  If you type in "
                + "words, we'll give you a story. Start by typing in a name");
    }

    // Get Data from Player
    public void enterName() {
        setName(scanner.nextLine());
    }

    public void enterAdjective1() {
        System.out.println("Please enter an adjective: ");
        setAdjective1(scanner.nextLine());
    }

    public void enterAdjective2() {
        System.out.println("Please enter another adjective: ");
        setAdjective2(scanner.nextLine());
    }

    public void enterNoun1() {
        System.out.println("Please enter a noun: ");
        setNoun1(scanner.nextLine());
    }

    public void enterNoun2() {
        System.out.println("Please enter another noun: ");
        setNoun2(scanner.nextLine());
    }

    public void enterNoun3() {
        System.out.println("Please enter one more noun: ");
        setNoun3(scanner.nextLine());
    }

    public void enterAdverb() {
        System.out.println("Please enter an adverb: ");
        setAdverb(scanner.nextLine());
    }

    public void putTogetherTheStory() {
        String story;
        int num = Math.abs(random.nextInt()) % 2;
        if (num == 0) {
            story = "Jessie and her best friend " + getName() + " went to Disney World today! "
                    + "They saw a " + getNoun1() + " in a show at the Magic Kingdom,"
                    + " and ate a " + getAdjective1() + " feast for dinner. The next day they"
                    + " ran " + getAdverb() + " to meet Mickey Mouse in his " + getNoun2()
                    + " and then that night, Jessie gazed at the " + getRandomNums() + " "
                    + getAdjective2() + " fireworks shooting from the " + getNoun3() + ".";
        } else {
            story = "Amanda and her frenemy " + getName() + " went to the zoo last summer. "
                    + "They saw a huge " + getNoun1() + " and a tiny little " + getNoun2()
                    + ". That night the decided to climb " + getAdverb() + " into the "
                    + getNoun3() + " to get a closer look. The zoo was " + getAdjective1()
                    + " at night, but they didn't care... until " + getRandomNums()
                    + " " + getAdjective2() + " apes yelled at their faces, making Amanda and "
                    + getName() + " sprint all the way back home.";
        }
        setStory(story);
    }

    public void fillInStory() {
        enterName();
        enterAdjective1();
        enterAdjective2();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdverb();
        setRandomNums();
        putTogetherTheStory();
        System.out.println(getStory());
    }

    public static void main(String[] args) {
        // TODO code application logic here
        MadLibs game = new MadLibs();
        game.printInstructions();
        game.fillInStory();

    }

}
