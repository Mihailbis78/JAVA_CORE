package training.abstract_lessen_1;

public class Sweeper extends Person{
    private final String bank;
    private final String overalls;
    public Sweeper(String name, String company, String clothes) {
        super(name);
        this.bank = company;
        this.overalls = clothes;
    }

    @Override
    public void display() {
        System.out.printf("Уборщик территории %s, %s. Форма одежды - %s.", bank, super.getName(), overalls);
    }

}
