
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*int x = 5;
        int y = 10;
        int sum = x + y; 
       
        System.out.println(sum); */
    
        Scanner s = new Scanner(System.in);
        System.out.println("Insert nickname");

        String username = s.nextLine();
        System.out.println("Hello " + username + " how old are you?");

        int age = s.nextInt();
        
        if (age < 20) {
            System.out.println("you are too young to enter");
        }

        if (age > 20) {
            System.out.println("Welcome!");
        }
    }
    
}