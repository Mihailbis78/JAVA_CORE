//package training.file_training_1.programmer2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SerializableEx1 {
//    public static void main(String[] args) {
//        List<String> employees = new ArrayList<>();
//        try (ObjectInputStream inputStream = new ObjectInputStream
//                (new FileInputStream("employees.bin"))) {
//            employees = (ArrayList) inputStream.readObject();
//            System.out.println(employees);
//
//
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
//    }
//}
