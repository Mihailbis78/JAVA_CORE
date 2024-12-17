//package lesson_3_2_5;
//
//import java.io.IOException;
//
//public class Test {
//    public static void main(String[] args) {
//        try (Car mers = new Car()) {
//            mers.drive();
//        } catch (Exception e) {
//        }
//    }
//}
//
//class Car implements AutoCloseable {
//    public void close() throws Exception {
//        System.out.println("Машина закрывается...");
//    }
//    public void drive() throws Exception {
//        System.out.println("Машина поехала.");
//    }
//}