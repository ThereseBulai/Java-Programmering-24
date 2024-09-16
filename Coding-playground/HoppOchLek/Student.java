public class Student {
    String name;
    int age;
    double grade;

    Student() {
        this.name = "Maja";
        this.age = 10;
        this.grade = 8;
     }
    
    public static void main (String [] args){
        Student elev = new Student();
        elev.name = "Kalle-hopp";
        elev.age = 8;
        elev.grade = 10;
      
        Student elev2 = new Student();

        System.out.println(elev.name);
        System.out.println(elev.age);
        System.out.println(elev.grade);

        System.out.println(elev2.name);
        System.out.println(elev2.age);
        System.out.println(elev2.grade);
    }
}
