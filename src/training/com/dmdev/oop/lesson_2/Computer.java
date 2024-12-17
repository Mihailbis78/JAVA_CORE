package training.com.dmdev.oop.lesson_2;

public class Computer {

    int ssd = 512;
    int ram = 16384;

    Computer() {
        System.out.println("я запустился");
    }

    Computer(int ssd) {
        this.ssd = ssd;
    }

    Computer(int ssd, int ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    void load() {
        System.out.println("Я загрузился ");
    }

    void load(boolean open) {
        System.out.println("Я загрузился ");
        if (open) {
            System.out.println("я открыл крыжку");
        }
    }

    void printState() {
        System.out.println("ssd: " + ssd);
        System.out.println("ram: " + ram);
    }


}
