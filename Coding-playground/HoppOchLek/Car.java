public class Car {

    String make;
    String model;
    String colour;
    int year;

    // nedan är tre constructors
    Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;

    }

    Car (String make, String model){
       this.make = make;
       this.model = model;
       this.year = year;
    }

    Car (String model){
    this.make = make;
    }


    public void printDetails(){
        System.out.println("Make " + make);
        System.out.println("Model " + model);
        System.out.println("Colour " + colour);
        System.out.println("Year " + year);



    }
    
    public static void main (String [] args){
        Car car1 = new Car("Volvo", "240", "Red", 1990);
        car1.printDetails();


        Car car2 = new Car("Toyota", "Yaris", "Unknown", 2024);
        car2.printDetails();


        Car car3 = new Car("Mazda");
        car3.printDetails();


    }

}
