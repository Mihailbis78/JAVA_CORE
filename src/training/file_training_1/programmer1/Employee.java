//package training.file_training_1.programmer1;
//
//import java.io.Serializable;
//
//public class Employee implements Serializable {
//    static final long serialVersionUID = 2;
//    String name;
//    String department;
//    int age;
//    transient double salary;
//    Car car;
//
//    Employee(
//            String name,
//             String department, int age, int salary, Car car) {
//        this.name = name;
//        this.department = department;
//        this.age = age;
//        this.salary = salary;
//        this.car = car;
//    }
//
//    @Override
//    public String toString() {
//        return "Employees{" +
//                "name='" + name + '\'' +
//                ", department='" + department + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                ", car=" + car +
//                '}';
//    }
//}
