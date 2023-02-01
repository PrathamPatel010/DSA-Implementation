package com.pratham.LinkedLists;

public class Main {
    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(1);
//        list.insertEnd(90);
//        list.insert(100,3);
//        list.printList();
//
//        list.deleteFirst();
//        list.printList();
//        list.deleteEnd();
//        list.printList();
//        list.delete(2);
//        list.printList();
//        System.out.println("Length of linkedlist: " + list.size());

//        DoublyLL dlist = new DoublyLL();
//        dlist.insertFirst(5);
//        dlist.insertFirst(4);
//        dlist.insertFirst(3);
//        dlist.insertFirst(2);
//        dlist.insertFirst(1);
//        dlist.insertLast(100);
//        dlist.insert(50,3);
//        dlist.printlist();
//        System.out.println("Length of LinkedList is: " + dlist.size());

        CircularLL clist = new CircularLL();
        clist.insert(10);
        clist.insert(20);
        clist.insert(30);
        clist.insert(40);
        clist.insert(50);
        clist.printlist();
        clist.delete(30);
        clist.printlist();
        System.out.println("Length of LinkedList is: " + clist.size());
    }
}
