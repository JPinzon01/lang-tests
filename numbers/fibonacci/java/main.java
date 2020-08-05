import java.util.Scanner; 

public class Main {

    public static void main(String args[]){
        Scanner inputScanner = new Scanner(System.in);  // Create a Scanner object
        long x;
        while (true) {    
            try{
                System.out.println("Enter a positive integer");
                String userEntry = inputScanner.nextLine();
                x = Integer.parseInt(userEntry);
                System.out.println(iterFib(x));
                break;
            } catch (IllegalArgumentException e) {
                // Repeat loop
            }
        }
    }

    /** Recursive implementation of Fibonacci's algorithm. */
    private static long fib(long x) throws IllegalArgumentException {
        long res;
        if (x < 0) {
            throw new IllegalArgumentException("Only positive integers allowed");
        } else if (x ==0) {
            res = 0;
        } else if (x ==1) {
            res = 1;
        } else {
               res = fib(x - 1) + fib (x - 2);
        }
        return res;
    }

    /** Iterative implementation of Fibonacci's algorithm. */
    private static long iterFib(long x) throws IllegalArgumentException {
        long res = 0, f0 = 0, f1 = 1;
        if (x < 0) {
            throw new IllegalArgumentException("Only positive integers allowed");
        }
        for (int i = 1; i <= x; i++){
            res = f0 + f1;
            f0 = f1;
            f1 = res;
        }
        return res;
    }
}
