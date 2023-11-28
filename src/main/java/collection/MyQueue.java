package collection;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    Queue<String> queue = new LinkedList<String>();
    public void getElement(String element){
        for (String el: queue) {
           if (el.equals(element)) {
               System.out.println(element);
               return;
           }
        }
        System.out.println("Животное не найдено");
    }
    public Boolean hasElement(String element){
        return queue.contains(element);
    }
    public void addTElement(String element){
        queue.add(element);
    }
    public void deleteElement(String element){
        queue.remove(element);
    }

}
