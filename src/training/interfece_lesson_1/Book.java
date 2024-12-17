package training.interfece_lesson_1;

public class Book implements Printable {
    String name;
    String autore;

    Book(String name, String autore) {
        this.name = name;
        this.autore = autore;
    }

    public void print() {
        System.out.printf("Книга : %s(автор: %s)", name, autore);
    }
    public void say() {
        System.out.println("Горит жопа!");
    }
}