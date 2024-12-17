package training.com.dmdev.oop.lesson_1;

public class TestExample {
    public static void main(String[] args) {
        int value = 10;
        int [] values = {value, 100, 200, 25};
        printArray(values);

    }

    private static void printArray(int[] values) {
        for (int val : values) {
            System.out.println(val);;

        }
    }


}
