package collection;

import java.util.HashSet;
public class MyHashSet {
    HashSet<String> set = new HashSet<String>();
    public void getElement(String element) {
        while (set.iterator().hasNext()) {
            if (element.equals(set.iterator().next())) {
                System.out.println(element);
            } else {
                System.out.println("Элемент отсутствует");
            }
        }
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
