package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
    HashSet<String> set = new HashSet<String>();
    public void getElement(String element) {
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                System.out.println(element);
                return;
            }
        }
        System.out.println("Элемент отсутствует");
    }
    public Boolean hasElement(String element){
        return set.contains(element);
    }
    public void addElement(String element){
        set.add(element);
    }
    public void deleteElement(String element){
        set.remove(element);
    }
}
