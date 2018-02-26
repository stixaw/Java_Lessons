package recursiongoodluck;

public class RecursionGOODLUCK {

    //compilation?
    // f(f(f(a))) a 20
    // summation: 5x4x3x2x1
    public static int Summation(int n) {
        //base case: we are at the end
        if (n <= 0) {
            return 0;
            // recursive case Keeps going till base.  
        } else {
            // 3 + Summation(n-1)
            // 3 +  Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 + 0 = 6
            System.out.println("n = " + n);
            return n + Summation(n - 1);
        }
    }
    
    // 5! = 5x4x3x2x1
    public static int Factorial(int n){
         //Base Case
        if (n <= 1){ // mult identity
            System.out.println("n = " + n);
            return 1;
         // recursive
         }else{
            System.out.println("n = " + n);
            return n * Factorial(n-1);     
        }
    }
    // 5^3 = 5x 5 x 5
    public static int Exponentiation(int n, int p){
        //Base case
        if (p <= 0){// mult identity
            return 1;
        }else{
            // 5 * Exponentiation(5, 2)
            // 5 * 5 * Exponentiation(5, 1)
            // 5 * 5 * 5 * Exponentiation(5, 0)
            // 5 * 5 * 5 * 1
            System.out.println("n = " + n);
            return n * Exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5,4));
    }

}
