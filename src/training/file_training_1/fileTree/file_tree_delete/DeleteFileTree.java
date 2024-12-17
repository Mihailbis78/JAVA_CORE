//package training.file_training_1.fileTree.file_tree_delete;
//
//import java.io.IOException;
//import java.nio.file.*;
//import java.nio.file.attribute.BasicFileAttributes;
//
//public class DeleteFileTree {
//    public static void main(String[] args) throws IOException {
//        Path path = Paths.get("/Users/mihailbystrov/Documents/JAVA/" +
//                "KATA/JAVA_CORE/src/training/file_training_1/x_copy/");
//        Files.walkFileTree(path, new MyFileVisitor());
//
//    }
//}
//class MyFileVisitor extends SimpleFileVisitor <Path> {
//
//    @Override
//    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
//        System.out.println("Удаляю файл: " + file.getFileName());
//        Files.delete(file);
//        return FileVisitResult.CONTINUE;
//    }
//
//    @Override
//    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
//        System.out.println("Удаляю папку: " + dir.getFileName());
//        Files.delete(dir);
//        return FileVisitResult.CONTINUE;
//    }
//}