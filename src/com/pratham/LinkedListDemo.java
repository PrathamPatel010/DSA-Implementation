package com.pratham;

public class LinkedListDemo {
    Node head;

    // creating static inner class so that main() function can access it
    static class Node{
        int data;
        Node next;

        // creating a constructor to allocate value of data to specific node
        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        // creating object to access Node class
        LinkedListDemo llist = new LinkedListDemo();

        // Creating a LinkedList consist of 4 Nodes
        Node first = new Node(10);
        llist.head = first;
        Node second = new Node(20);
        first.next = second;
        Node third = new Node(30);
        second.next = third;
        Node fourth = new Node(40);
        third.next = fourth;
        System.out.println("LinkedList Consist of 4 Nodes: ");
        llist.printlist();

        // Inserting element at beginning of linkedlist
        llist.insertBeginning(369);
        System.out.println("LinkedList after insertion at beginning:");
        llist.printlist();

        // Inserting element at end of linkedlist
        llist.insertEnd(370);
        System.out.println("LinkedList after insertion at end:");
        llist.printlist();
    }

    void insertBeginning(int new_data){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void insertEnd(int new_data){
        if(head==null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node new_node = new Node(new_data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
        new_node.next = null;
    }

    void printlist(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
