package training.NestedClass_lesson_1;

public class Human {
    public Head head;

    public Human() {
        this.head = new Head();
    }

    void say() {
        System.out.println("My voice " + head.voice);
    }




    class Head {
        String voice = "thin";




    }
}
