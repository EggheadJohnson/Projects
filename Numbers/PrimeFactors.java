/*Paul Johnson
 * Solution to Prime Factorization - Have the user enter a number and find all
 Prime Factors (if there are any) and display them.
 */

package primefactors;


import java.util.Scanner;
public class PrimeFactors {

    
    private static Scanner scanner = new Scanner( System.in );
    public static boolean isPrime(int n){
        if (n <= 2) return true;
        for (int x = 2; x < n; x++){
            if (n%x == 0) return false;

        }
        return true;
    }
    public static int[] factors(int n){
        int[] list = new int[n];
        if (n <= 2){
            list[0] = n;
            System.out.println(n);
            return list;
        }
        int x = 2;
        int c = 0;
        while(n>1){
            if (n%x == 0 && isPrime(x)){
                list[c] = x;
                n = n/x;
                x = 2;
                c++;
            }
            else x++;
        }
        
        return list;
    }
    public static void main(String[] args) {
        System.out.print( "What number would you like factored? " );
        String userIn = scanner.nextLine();
        int input = Integer.parseInt(userIn);
        int[] prFacts = factors(input);
        for (int y = 0; y < prFacts.length; y++){
            if (prFacts[y] == 0) break;
            System.out.println(prFacts[y]);
        }
        
    }

    

}
