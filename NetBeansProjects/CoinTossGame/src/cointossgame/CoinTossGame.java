
package cointossgame;

import java.util.Random;

public class CoinTossGame {
    
    public String tossCoin(){
        String result = "TAILS";
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2;
        if (toss == 0){
            result = "HEADS";
        }
        return result;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoinTossGame game = new CoinTossGame();
        System.out.println(game.tossCoin());
    }
    
}
