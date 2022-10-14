package com.pratham;

public class DoublyLL {
    static Node head;

    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            data = val;
            next = null;
        }
    }
    public static void main(String[] args) {
        DoublyLL llist = new DoublyLL();

        // Creating 5 Nodes
        Node first = new Node(10);
        head = first;

        Node second = new Node(20);
        first.next = second;
        second.prev = first;

        Node third = new Node(30);
        second.next = third;
        third.prev = second;

        Node fourth = new Node(40);
        third.next = fourth;
        fourth.prev = third;

        Node fifth = new Node(50);
        fourth.next = fifth;
        fifth.prev = fourth;

        System.out.println("LinkedList Consist of 5 Nodes: ");
        llist.display();

        llist.insertBegin(369);
        llist.insertEnd(370);
        llist.insertSpecific(20,100);

        System.out.println("After insertion at beginning,at end,at specific position: ");
        llist.display();
    }

    void display(){
        Node ptr;
        ptr = head;
        while (ptr!=null){
            System.out.print(ptr.data + " ");
            ptr=ptr.next;
        }
        System.out.println();
    }

    void insertBegin(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int val){
        Node newNode = new Node(val);
        Node ptr = head;
        while (ptr.next!=null){
            ptr = ptr.next;
        }
        newNode.prev = ptr;
        ptr.next = newNode;
    }

    void insertSpecific(int val,int data){
        Node newNode = new Node(data);
        Node ptr = head;
        while (ptr.data!=val){
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        newNode.prev = ptr;
    }

}
