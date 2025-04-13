import java.sql.SQLOutput;

public class Book {

    String title;
    String author;
    int price;

    Book(){
        this.title="Unknown";
        this.author="Unknown" ;
        this.price=0;
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    String getTitle(){
        return title;
    }
    String getauthor(){
        return author;
    }
    int price(){
        return price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println("Title of the book is:"+ book1.getTitle());
        System.out.println("Author of the book is:"+ book1.getauthor());

        Book book2 = new Book("Amatka","Karin Tidbeck");
        System.out.println("Title of the book is:"+ book2.getTitle());
        System.out.println("Author of the book is:"+ book2.getauthor());

        Book book3 = new Book("Altered Carbon","Richard K. Morgan");
        System.out.println("Title of the book is:"+ book3.getTitle());
        System.out.println("Author of the book is:"+ book3.getauthor());

    }


}
