import java.util.Scanner;

public class SwitchEcommerce {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Chose product:");
    System.out.println("1.Electronics. 2. Furniture. 3.Groceries and  4.others");

    int products = scanner.nextInt();
    Scanner s = new Scanner(System.in);
    switch (products) {
  

      case 1:
        System.out.println("Elctronics - Chose quantity");
        int amount = s.nextInt();
      
        break;
      case 2:
        System.out.println("Furnitute - Chose quantity");
        
        break;
      case 3:
        System.out.println("Groceries - Chose quantity");
       
        break;
      case 4:
        System.out.println(" Others - Chose quantity");
        
        break;
    }

    scanner.close();
  }

}