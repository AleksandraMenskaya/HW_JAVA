import collection.MyArrayList;
import collection.MyHashMap;
import collection.MyHashSet;
import collection.MyQueue;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        arrayListWork();
        queueWork();
        hashMapWork();
        hashSetWork();
    }
    public static void arrayListWork() {

        ArrayList arrayListUtil= new ArrayList(List.of(100, 183, 9987));
        MyArrayList arrayList = new MyArrayList(arrayListUtil);
        arrayList.addElement(100);
        arrayList.addElement(106);
        arrayList.addElement(199);

        arrayList.getElement(183);
        arrayList.getElement(1066);
        if (arrayList.hasElement(100)) {
            arrayList.deleteElement(100);
            System.out.println("Элемент удален");
        } else {
            System.out.println("Элемент не найден");
        }
        if (arrayList.hasElement(199)) {
            System.out.println("Элемент 199 найден");
        }
        if (arrayList.hasElement(99)) {
            System.out.println("Элемент 99 найден");
        } else {
            System.out.println("Элемент 99 не найден");
        }
    }
    public static void queueWork() {
        MyQueue queue = new MyQueue();
        queue.addTElement("cow");
        queue.addTElement("horse");
        queue.addTElement("rabbit");
        queue.addTElement("donkey");

        queue.getElement("rabbit");
        queue.getElement("pig");
        if (queue.hasElement("pig")) {
            System.out.println("Запись найдена");
        } else {
            System.out.println("Запись отсутствует");
        }
        if (queue.hasElement("horse")) {
            System.out.println("Запись лошадь найдено");
        } else {
            System.out.println("Запись лошадь отсутствует");
        }
        if (queue.hasElement("cow")) {
            queue.deleteElement("cow");
            System.out.println("Запись удалена");
        } else {
            System.out.println("Запись не найдена");
        }
        queue.deleteElement("pig");
    }
    public static void hashMapWork() {
        MyHashMap hashMap = new MyHashMap();
        hashMap.addElement(0, "greyBox" );
        hashMap.addElement(1, "whiteBox" );
        hashMap.addElement(2, "blackBox" );
        hashMap.addElement(3, "purpleBox" );

        hashMap.getElement(2);
        hashMap.addElement(2, "silverBox" );
        if (hashMap.hasElement(2)) {
            hashMap.getElement(2);
        } else {
            System.out.println("Запись отсутствует");
        }
        if (hashMap.hasElement(0)) {
            hashMap.deleteElement(0);
            System.out.println("Запись удалена");
        } else {
            System.out.println("Запись не найдена");
        }
    }
    public static void hashSetWork() {
        MyHashSet hashSet = new MyHashSet();
        hashSet.addElement("yellow");
        hashSet.addElement("white");
        hashSet.addElement("red");
        hashSet.addElement("pink");

        hashSet.getElement("blue");
        hashSet.getElement("pink");
        if (hashSet.hasElement("white")) {
            System.out.println("Элемент white найден");
        } else {
            System.out.println("Элемент white не найден");
        }
        if (hashSet.hasElement("purple")) {
            hashSet.deleteElement("purple");
            System.out.println("Элемент purple удален");
        } else {
            System.out.println("Элемент purple не найден");
        }
        if (hashSet.hasElement("yellow")) {
            hashSet.deleteElement("yellow");
            System.out.println("Элемент удален");
        } else {
            System.out.println("Элемент не найден");
        }
    }
}
