package Constructors;

public class Books {
    public String title;
    public String author;
    public int year;

    //default constructor
    public Books(){
        this("Unknown", "Unknown");
    }

    public Books(String title, String author){
        this(title, "Unkown", 1);

    }

    public Books(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public static void main(String[] args) {
        
        Books lotr = new Books("Lord of the rings", "JRR Tolkien", 1960);
        Books witcher = new Books("Witcher","Unknown", 1995);

        System.out.println(lotr.title);
        System.out.println(witcher.title);

    }




    }


