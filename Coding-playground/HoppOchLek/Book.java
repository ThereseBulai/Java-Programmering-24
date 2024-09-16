public class Book {
   String title;
   String author;
   int year;

   // Nedan för är en tom konstruktor
   Book() {  
   }

   public static void main(String[] args) {
      

   Book bok = new Book();

}


 /* 
   Book(String title, String author, int year) {

      this.title = "Lord of the rings";
      this.author = "Tolkien";
      this.year = 1960;
   }

   Book(String title, String author, int year) {

      this.title = title;
      this.author = author;
      this.year = year;

   }
   /*
    * System.out.println("Title: " + title);
    * System.out.println("Author:" + author);
    * System.out.println("Year: " + year);
    */

 /*   public static void main (String [] args){
   Book bok = new Book();
   Book lotr = new Book(title:"lotr", author:"Tolkien", year:1960);
   Book hp = new Book(author: "JK R");
   
   System.out.println(bok);
   System.out.println(lotr);
   System.out.println(hp);
   }

*/


}
