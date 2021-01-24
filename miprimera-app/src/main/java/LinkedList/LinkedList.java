package LinkedList;

import java.util.List;


public class LinkedList {
    private int size;
    private Node head;

    public LinkedList(){
        size = 0;
        head = new Node(null);
    }
    
    public void append(Double data){
        if (size==0) {
            head = new Node(data);
        }
        else{
            Node last = new Node(data);
            Node current = head;
            while(current.getNext()!= null){
                current = current.getNext();
            }
            current.setNext(last);
        }
        size++;
    }
    public Double get(int index){
        if (index < 0 ){
            return null;
        }
        if (head != null){
           // System.out.println("head data: "+head.getData());
           // System.out.println("head data: "+head.getNext());
            int count = 0;
            Node current = head;
            for(int i = 0; i < index; i++){
                if(current.getNext() == null){
                    //System.out.println("entra");
                    return null;
                }
                current = current.getNext();
                count ++;
            }
            return current.getData();
        }
        return null;
    }
    public String toString() {
        String output = "";

        if (head != null) {
            Node current = head.getNext();
            while (current != null) {
                output += "[" + current.getData().toString() + "]";
                current = current.getNext();
            }

        }
        return output;
    }
}
