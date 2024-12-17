//package training.file_training_1.programmer1;
//
//import java.io.*;
//
//public class SerializableEx2 {
//    public static void main(String[] args) {
//
//        Car car = new Car("Lexus", "silver");
//        Employee employee1 = new Employee(
//                "Evgeniy",
//                "repairman", 35,70000, car);
//
//        try (ObjectOutputStream outputStream = new ObjectOutputStream
//                (new FileOutputStream("employee1.bin"))) {
//            outputStream.writeObject(employee1);
//            System.out.println("Done!");
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//    }
//
//
//}
