package training.extend_lesson_1;

public class Cow extends Animal {

    Cow(){}

    Cow(String say, int teeth) {
        setSay(say);
        setTeeth(teeth);
    }


    void mu() {
        System.out.println(getSay() + ", во все - " + getTeeth() + " зуба :)");
    }

}
