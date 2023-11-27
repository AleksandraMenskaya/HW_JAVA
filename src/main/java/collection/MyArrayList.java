package collection;

import java.util.ArrayList;

public class MyArrayList {
    ArrayList list = new ArrayList();
    public void getElement(Integer intArL){
        for (int i = 0; i < list.size(); i++) {
            if (intArL == list.get(i)){
                System.out.println(intArL);
            }
            else {
                System.out.println("Элемент отсутствует");
            }
        }
    }
    public Boolean hasElement(Integer intArL){
        boolean notHaveElement = list.indexOf(intArL) == -1;
        return notHaveElement;
    }
    public void addElement(Integer intArL){
        list.add(intArL);
    }
    public void deleteElement(Integer intArl){
        list.remove(intArl);
    }
}
