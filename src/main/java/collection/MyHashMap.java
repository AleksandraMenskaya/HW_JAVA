package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public String getElement(Integer id) {
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        do {
            if (id == iterator.next()) {
                System.out.println(map.get(id));
                return map.get(id);
            }
        }
        while (iterator.hasNext()) ;
        System.out.println("Элемент отсутствует");
        return null;
    }
    public Boolean hasElement(Integer id){
        return map.containsKey(id);
    }
    public void addElement(Integer id, String name){
        map.put(id, name);
    }
    public void deleteElement(Integer id){
        map.remove(id);
    }
}
