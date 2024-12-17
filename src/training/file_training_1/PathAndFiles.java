//package training.file_training_1;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class PathAndFiles {
//    public static void main(String[] args) throws IOException {
//
//        Path filePath = Paths.get("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/fold/test15.txt");
//        Path derectoryPath = Paths.get("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/fold/");
//        Path filePath3 = Paths.get("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/text10.txt");
//        Path filePath2 = Paths.get("/Users/mihailbystrov/Documents/M/Z/A/text25.txt");
//
//
//        System.out.println("filePath.getFileName(): " + filePath.getFileName());
//        System.out.println("derectoryPath.getFileName(): " + derectoryPath.getFileName());
//        System.out.println("____________________________________");
//
//        System.out.println("filePath.getParent(): " + filePath.getParent());
//        System.out.println("derectoryPath.getParent(): " + derectoryPath.getParent());
//        System.out.println("____________________________________");
//
//        System.out.println("filePath.getRoot(): " + filePath.getRoot());
//        System.out.println("derectoryPath.getRoot(): " + derectoryPath.getRoot());
//        System.out.println("____________________________________");
//
//        System.out.println("filePath.isAbsolute(): " + filePath.isAbsolute());
//        System.out.println("derectoryPath.isAbsolute(): " + derectoryPath.isAbsolute());
//        System.out.println("____________________________________");
//
//        System.out.println("derectoryPath.resolve(filePath): " + derectoryPath.resolve(filePath));
//        System.out.println("____________________________________");
//
//
//        System.out.println("derectoryPath.relativize(filePath2): " + derectoryPath.relativize(filePath2));
//        System.out.println("____________________________________");
//
//
//        System.out.println("Files.size(filePath3): " + Files.size(filePath3));
//        System.out.println("____________________________________");
//
//        System.out.println("Files.getAttribute(filePath3,\"creationTime\"): " + Files.getAttribute(filePath3,"creationTime"));
//        System.out.println("____________________________________");
//
//
//
//    }
//}
