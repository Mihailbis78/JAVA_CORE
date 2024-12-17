//package training.file_training_1.programmer1;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class SerializableEx1 {
//    public static void main(String[] args) {
//
//    List<String> employees =  new  ArrayList<>();
//    employees.add("Mikhail");
//    employees.add("Galina");
//    employees.add("Andrey");
//    employees.add("Evgeniy");
//
//    try (ObjectOutputStream outputStream = new ObjectOutputStream
//            (new FileOutputStream("employees.bin"))) {
//        outputStream.writeObject(employees);
//        System.out.println("Done!");
//
//
//    } catch (FileNotFoundException e) {
//        throw new RuntimeException(e);
//    } catch (IOException e) {
//        throw new RuntimeException(e);
//    }
//
//
//    }
//}
