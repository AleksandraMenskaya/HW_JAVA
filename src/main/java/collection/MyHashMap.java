package collection;

import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    HashMap<Integer, String> map = new HashMap<Integer, String>();

    public void getElement(Integer id) {
        Set set = map.keySet();
        do {
            if (id == set.iterator().next()) {
                System.out.println(map.get(id));
            } else {
                System.out.println("Элемент отсутствует");
            }

        }
        while (set.iterator().hasNext()) ;
    }
    public Boolean hasElement(Integer id){
        return map.containsKey(id);
    }
    public void addElement(Integer id, String name){
        map.put(id, name);
    }
    public void deleteElement(Integer id, String name){
        map.remove(id, name);
    }
}
