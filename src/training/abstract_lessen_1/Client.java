package training.abstract_lessen_1;

public class Client extends Person {
    private final String bank;
    public Client(String name, String company) {
        super(name);
        this.bank = company;
    }

    @Override
    public void display() {
        System.out.printf("Имя: %s. Открыт счёт в отделении банка: %s \n",super.getName(), bank);
    }
}
