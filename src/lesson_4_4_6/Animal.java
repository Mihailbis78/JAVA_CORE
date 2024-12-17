//package lesson_4_4_6;
//
//import java.io.ByteArrayInputStream;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.util.Objects;
//
//public static Animal[] deserializeAnimalArray(byte[] data) {
//    try (ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data))) {
//        int count = ois.readInt();
//        Animal[] animals = new Animal[count];
//        for (int i = 0; i < count; i++) {
//            animals[i] = (Animal) ois.readObject;
//        }
//        return animals;
//    } catch (Exception e) {
//        throw new IllegalArgumentException(e);
//    }
//}
//
//
