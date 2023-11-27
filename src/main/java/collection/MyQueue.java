package collection;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<String> queue = new LinkedList<>();
    public void getElement(String element){
        for (String el: queue) {
           if (el.equals(element)) {
               System.out.println(element);
           }
           else {
               System.out.println("Элемент отсутствует");
           }
        }
    }
    public Boolean hasElement(Integer id){
        return queue.contains(id);
    }
    public void addTElement(String element){

        queue.add(element);
    }
    public void deleteElement(String element){

        queue.remove(element);
    }

}
