//package training.file_training_1.fileTree;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//
//public class FileTree {
//    public static void main(String[] args) throws Exception {
//        Path path = Paths.get("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/x/");
//        Files.walkFileTree(path, new MyFileVisitor());
//
//    }
//}
//class MyFileVisitor implements FileVisitor <Path> {
//
//    @Override
//    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
//            throws IOException {
//        System.out.println("Enter to Directory: " + dir);
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
//            throws IOException {
//        System.out.println("File name: " + file.getFileName());
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult visitFileFailed(Path file, IOException exc)
//            throws IOException {
//        System.out.println("Error while visiting file: " + file.getFileName());
//        return FileVisitResult.TERMINATE;
//    }
//
//    @Override
//    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
//            throws IOException {
//        System.out.println("Exit from Directory: " + dir);
//        return FileVisitResult.CONTINUE;
//    }
//}
