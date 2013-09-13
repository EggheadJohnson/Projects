/*Paul Johnson
 * Solution to Find PI to the Nth Digit - Enter a number and have the program
 generate PI up to that many decimal places. Keep a limit to how far the
 program will go.
 */

package printingpi;

import java.util.Scanner;
public class PrintingPi {

   
    private static Scanner scanner = new Scanner( System.in );
    public static long[] piToArray(){
        long[] l = new long[15];
        for (int x = 1; x < 16; x++){
            double m = Math.pow(10,x);
            double n = m*Math.PI;
            
            long o = (long) n;

            l[x-1] = o%10;
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.print( "How places of Pi would you like displayed? (Max 15) " );
        String userIn = scanner.nextLine();
        int input = Integer.parseInt(userIn);
        long[] p = piToArray();
        System.out.print("3.");
        for(int x = 0; x < input; x++){
            System.out.print(p[x]);
        }
    }

}
