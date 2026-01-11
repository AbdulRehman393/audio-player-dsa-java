package newpackage;

import java.util.ArrayList;

public class LinkedList {
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public String getFirst() {
        return head != null ? head.data : null;
    }

    public void removeFirst() {
        if (head != null) {
            head = head.next;
            if (head == null) tail = null;
        }
    }

    public ArrayList<String> getAllTracks() {
        ArrayList<String> tracks = new ArrayList<>();
        Node current = head;
        while (current != null) {
            tracks.add(current.data);
            current = current.next;
        }
        return tracks;
    }
}
