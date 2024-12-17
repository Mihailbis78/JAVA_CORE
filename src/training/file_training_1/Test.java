//package training.file_training_1;
//
//import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Arrays;
//
//public class Test {
//    public static void main(String[] args) throws Exception{
//
//        File file = new File("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/text.txt");
//        File file2 = new File("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/text2.txt.txt");
//        File folder = new File("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1");
//        File folder2 = new File("/Users/mihailbystrov/Documents/JAVA/KATA/" +
//                "JAVA_CORE/src/training/file_training_1/folder2");
//
//        System.out.println("file.getAbsolutePath(): " + file.getAbsolutePath());
//        System.out.println("folder.getAbsolutePath(): " + folder.getAbsolutePath());
//        System.out.println("-----------------------------------------------------");
//        System.out.println("file.isDirectory(): " + file.isDirectory());
//        System.out.println("folder.isDirectory(): " + folder.isDirectory());
//        System.out.println("-----------------------------------------------------");
//        System.out.println("file.exists(): " + file.exists());
//        System.out.println("folder.exists(): " + folder.exists());
//        System.out.println("-----------------------------------------------------");
//        System.out.println("file.createNewFile(): " + file.createNewFile());
//        System.out.println("folder.mkdir(): " + folder.mkdir());
//        System.out.println("-----------------------------------------------------");
//        System.out.println("file.length(): " + file.length());
//        System.out.println("folder.length(): " + folder.length());
//        System.out.println("-----------------------------------------------------");
//
//        System.out.println("file2.createNewFile(): " + file2.createNewFile());
//        System.out.println("folder2.mkdir(): " + folder2.mkdir());
//        System.out.println("file2.delete(): " + file2.delete());
//        System.out.println("folder2.delete(): " + folder2.delete());
//        System.out.println("-----------------------------------------------------");
//        File[] files = folder.listFiles();
//        System.out.println(Arrays.toString(files));
//        System.out.println("-----------------------------------------------------");
//        System.out.println("file.isHidden(): " + file.isHidden());
//
//        System.out.println("file.canRead(): " + file.canRead());
//        System.out.println("file.canWrite(): " + file.canWrite());
//        System.out.println("file.canExecute(): " + file.canExecute());
//
//
//    }
//}
//
