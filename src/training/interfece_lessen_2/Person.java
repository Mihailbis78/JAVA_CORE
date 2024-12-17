package training.interfece_lessen_2;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hallo");
    }

    @Override
    public void showInfo() {
        System.out.println("Name this " + this.name);
    }
}
