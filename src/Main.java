import service.Printable;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("\"I'm Zlatan\"","Zlatan Ibrahimovic");
        Book book1 = new Book("\"VERITY \"","Colleen Hoover");
        Book book2 = new Book("\"THE BOYS FROM BILOXI\"","John Grisham");
        Magazine magazine = new Magazine("\"Game Informer\"","Game News");
        Magazine magazine1 = new Magazine("\"National Geographic\"","Nature");

        Printable[] printable = new Printable[]{book,book1,book2,magazine,magazine1};
        for (Printable cl:printable) {
            cl.print();
        }
        Book.printBooks(printable);
        Magazine.printMagazines(printable);
    }
}
//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//Создать статический метод printMagazines(Printable[] printable)
//в классе Magazine, который выводит на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book,
//который выводит на консоль названия только книг.