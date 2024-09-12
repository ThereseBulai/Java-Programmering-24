import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {

        // nested loop multiplication table
        /*
         * for (int i = 1; i <= 10; i++) {
         * 
         * for (int j = 1; j <= 10; j++) {
         * 
         * System.out.print(i * j + " "); s
         * 
         * }
         * System.out.println();
         * 
         * }
         */
        // Nested loops number pyramid
        /*
         * System.out.println("       1");
         * System.out.println("     1 2 1");
         * System.out.println("   1 2 3 2 1");
         */

/* // nummer-pyramid
        for (int i = 1; i <= 5; i++) {
                
            for (int x = 9-i*2; x >= 0; x--) {
                System.out.print(" ");
            }
 
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print(j);
            }

            for (int x = (i -1); x > 0; x--) {
                System.out.print(" ");
                System.out.print(x);
            }
            System.out.println();
        }
*/

// to-do lista

import java.util.Scanner;

    public class MenuSelection {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Choose an option:");
       System.out.println("1. Start");
       System.out.println("2. Settings");
       System.out.println("3. Exit");
       
       int choice = scanner.nextInt();
       
       switch (choice) {
          // To do: Implement a switch case which displays a message depending on user input
       }
       
       scanner.close();
   }
}


    }
}
