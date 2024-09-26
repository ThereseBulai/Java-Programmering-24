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

          case 1:
            System.out.println("Start game");
            break;
            case 2:
            System.out.println("Settings menu");
            break;
            case 3:
            System.out.println("Exit game");
            break;
       }
       
       scanner.close();
   }
}