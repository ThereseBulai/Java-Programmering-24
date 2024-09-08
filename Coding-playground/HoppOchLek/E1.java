
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
/* //övning 1.14
        
        int value = 33;

        if (value % 2 == 0) {
            System.out.println("Even");
        } 
        else {
            System.out.println("Odd");
        }
        if (value > 10);{
            System.out.println("Greater than 10");
        }
 */



 /* //Övning 1.15

        String sentence = "Many things of the world is round";
        System.out.println(sentence.indexOf("a"));
        int index = sentence.indexOf("a");

        System.out.println("The word was found at index:" + index);
 */     

 /*//övning 1.16
    int a = 2, b = 4, c = 6, temp = a;
    a = b;
    b = c;
    c = temp; 
    System.out.println("A= " + (a=b) + " B= " + (b=c) + " C= " + (c=temp));
 */

   /*//övning 1.17
    int n = 236;
    int Sn = n * (n + 1) / 2;
    System.out.println(Sn);
    */
 
    //Övning 1.18
   /*  String originalString = "Hey, I think you are relly cool!";
    int countwords = originalString.split(" ").length;
    System.out.println("the sentence " +  originalString + " has " + countwords + " words in it");
    */

    String reversedString = "Hey, I think you are really cool!";
    StringBuffer sbr = new StringBuffer(reversedString);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);


    

    

    }
    

}
