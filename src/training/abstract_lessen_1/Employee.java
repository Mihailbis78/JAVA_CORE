package training.abstract_lessen_1;

public class Employee extends Person{
    private final String bank;
    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    @Override
    public void display() {
        System.out.printf("Служащий отделения банка %s, %s.\n", bank, super.getName());
    }

}
