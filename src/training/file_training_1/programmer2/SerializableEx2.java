//package training.file_training_1.programmer2;
//
//import training.file_training_1.programmer1.Employee;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//public class SerializableEx2 {
//    public static void main(String[] args) {
//
//        Employee bestEmployee;
//
//        try (ObjectInputStream inputStream = new ObjectInputStream(
//                new FileInputStream("employee1.bin")
//        )) {
//           bestEmployee = (Employee) inputStream.readObject();
//            System.out.println(bestEmployee);
//
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
//
//
//}
