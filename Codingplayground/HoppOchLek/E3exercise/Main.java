package E3exercise;
public class Main {
   public static void main(String[] args) {  
    Dogs dogs = new Dogs();
    
  
    dogs.kai.age = 3;
    dogs.kai.breed = "Schipperke";
    dogs.kai.colour = "Black";



    dogs.kendji.age = 4;
    dogs.kendji.breed = "Dansk-Svensk Gårdshund";
    dogs.kendji.colour = "White and brown";

    
    

  System.out.println(dogs.kai.age);
  System.out.println(dogs.kai.breed);
  System.out.println(dogs.kai.colour);

  System.out.println(dogs.kendji.age);
  System.out.println(dogs.kendji.breed);
  System.out.println(dogs.kendji.colour);

      Dog tilly = new Dog();
      tilly.age = 8;
      tilly.breed = "Labrador";
      tilly.colour = "Yellow";

      System.out.println("We have a new dog it's a " + tilly.breed);

      Dog Miso = dogs.kai;
   
  
      System.out.println(tilly);
      System.out.println(Miso);
      System.out.println(dogs.kai.age);
      System.out.println(dogs.kendji);

   }
   



    
}
