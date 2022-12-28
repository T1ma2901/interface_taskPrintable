import service.Printable;

public class Book implements Printable {
     String name ;
    String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    static void printBooks(Printable[] printable){
        System.out.println("\n <<<Books>>>");
        for (Printable p:printable) {
            if(p instanceof Book){
                System.out.println(p);
            }
        }

    }

    @Override
    public void print() {
        System.out.printf("\nНазвание книги: %s\nАвтор: %s\n",name,author);
    }

    @Override
    public String toString() {
        return "\nBook: "+name+"\nАвтор: "+author;
    }
}
