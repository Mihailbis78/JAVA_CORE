//package lesson_3_1_3;
//import java.lang.*;
//
//public class Test {
//    public static void main(String[] args) {
//        System.out.println(getCallerClassAndMethodName());
//        System.out.println(getCallerClassAndMethodName());
//        anotherMethod();
//        anotherMethod();
//    }
//
//    private static void anotherMethod() {
//        System.out.println(getCallerClassAndMethodName());
//    }
//
//    public static String getCallerClassAndMethodName() {
//        StackTraceElement[] stackTrace = new Exception().getStackTrace();
//        String messege = null;
//        if (stackTrace.length >= 3) {
//            for (int i = 1; i < stackTrace.length; i++) {
//                StackTraceElement element = stackTrace[i];
//                String getClassName = element.getClassName();
//                String getMetodName = element.getMethodName();
//                messege = getClassName + "#" + getMetodName;
//                return messege;
//            }
//        }
//        return messege;
//    }
//}