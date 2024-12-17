//package training.file_training_1;
//
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileReaderEx {
//    public static void main(String[] args) {
//
//        try (FileReader file = new FileReader("/Users/mihailbystrov/Documents/JAVA/" +
//                    "KATA/JAVA_CORE/src/training/file_training_1/text10.txt")){
//            int character;
//            while ((character = file.read()) != -1) {
//                System.out.print((char) character);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
////        FileReader file = null;
////        try {
////            file = new FileReader("/Users/mihailbystrov/Documents/JAVA/" +
////                    "KATA/JAVA_CORE/src/training/file_training_1/text10.txt");
////            int character;
////            while ((character = file.read()) != -1) {
////                System.out.print((char) character);
////            }
////
////        } catch (Exception e) {
////
////        } finally {
////            file.close();
////        }
//
//    }
//}
