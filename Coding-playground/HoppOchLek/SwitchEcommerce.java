import java.util.Scanner;

public class SwitchEcommerce {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Chose product:");
    System.out.println("1.Electronics. 2. Furniture. 3.Groceries and  4.others");
    
    int products = scanner.nextInt();

    switch(products) {
        System.out.println("Chose amount");

          case 1:
            System.out.println("Chose amount");
            int products = scanner.nextInt();

            break;
    }
          /*   
            case 2:
            System.out.println("Settings menu");
            break;
            case 3:
            System.out.println("Exit game");
            break;
       
*/

      /* System.out.println("Chose amout");
    
       int products = scanner.nextInt();
     
      */ 

    scanner.close();
}

}