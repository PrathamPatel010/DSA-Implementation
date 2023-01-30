package com.pratham.LinkedLists;

public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFirst(5);
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertEnd(90);
        list.insert(100,3);
        list.printList();

        list.deleteFirst();
        list.printList();
        list.deleteEnd();
        list.printList();
        list.delete(2);
        list.printList();
        System.out.println("Length of linkedlist: " + list.size());

    }
}
