import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {

        /*
         * övning 2.4 a)
         * 
         * for (int i = 1; i <=10; i++) {
         * 
         * System.out.println(i);
         * }
         */

        /*
         * övning 2.4 b)
         * int i = 2;
         * while (i <= 20) {
         * if (i % 2 == 0) { // för att få den att räkna jämna nummer
         * System.out.println(i);
         * 
         * }
         * i++;
         * }
         */

        /*
         * Scanner s = new Scanner(System.in);
         * 
         * System.out.println("Choose a number");
         * int x = s.nextInt();
         * 
         * for (int i = 1; i <= 10; i++) {
         * 
         * System.out.println(x * i);
         * }
         */
        /*
         * int i = 10;
         * while (i >=1) {
         * System.out.println(i);
         * i--;
         * }
         */
        /* //övning 2.4 e - inte lika smidigt skrivet som lösningen nedanför. 
         * int sum = 0;
         * for (int i = 0; i < 10; i++) {
         * sum = sum + 1 + (i * 2);
         * }
         * System.out.println(sum);
         */

        int sum = 0;
        for (int i = 0; i < 20; i++) {

            if (i % 2 != 0) { // nu hittar vi alla ojämna nummer (!= 0 --> inte lika med 0)
                sum = sum + i;
            }

        }
        System.out.println(sum);

    }

}
