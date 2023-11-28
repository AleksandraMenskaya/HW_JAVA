package collection;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    ArrayList list;
    public MyArrayList(List listArg) {
        list = new ArrayList();
        list.addAll(listArg);
    }

    public MyArrayList() {
        list = new ArrayList();
    }

    public void getElement(Integer num){
        for (int i = 0; i < list.size(); i++) {
            if (num.equals(list.get(i))){
                System.out.println(num);
                return;
            }
        }
        System.out.println("Элемент отсутствует " + num);
    }
    public Boolean hasElement(Integer num){
        boolean hasElement = list.indexOf(num) != -1;
        return hasElement;
    }
    public void addElement(Integer num){
        list.add(num);
    }
    public void deleteElement(Integer num){
        list.remove(num);
    }
}
