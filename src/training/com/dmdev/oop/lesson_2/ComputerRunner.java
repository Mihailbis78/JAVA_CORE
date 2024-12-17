package training.com.dmdev.oop.lesson_2;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        computer.load();
//        System.out.println("ram: " + computer.ram);
//        System.out.println("ssd: " + computer.ssd);
//
        System.out.println("параметры первого ПК: ");
        computer.printState();
        Computer computer1 = new Computer(1024);
        System.out.println("параметры второго ПК");
        computer1.printState();
        Computer computer2 = new Computer(128, 4096);
        System.out.println("параметры третьего ПК");
        computer2.printState();

        computer.load(true);
    }
}
