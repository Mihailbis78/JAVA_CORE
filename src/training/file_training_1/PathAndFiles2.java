//package training.file_training_1;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//
//public class PathAndFiles2 {
//    public static void main(String[] args) throws IOException {
//
//        Path filePath = Paths.get("/Users/mihailbystrov/Documents/JAVA/" +
//                "KATA/JAVA_CORE/src/training/file_training_1/text10.txt");
//        Path directoryPath = Paths.get("/Users/mihailbystrov/Documents/JAVA/" +
//                "KATA/JAVA_CORE/src/training/file_training_1/fold/");
//        Files.copy(filePath,directoryPath.resolve("text11.txt"), StandardCopyOption.REPLACE_EXISTING);
//        System.out.println("Done!");
//        // Files.move(filePath,directoryPath.resolve("text11.txt"))
////        Files.delete(Paths.get("/Users/mihailbystrov/Documents/JAVA/" +
////                "KATA/JAVA_CORE/src/training/file_training_1/text5.txt"));
//    }
//}
