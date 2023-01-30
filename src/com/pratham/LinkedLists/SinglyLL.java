package com.pratham.LinkedLists;

public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size = 0;
    }
    public int size(){
        return this.size;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail==null){
            tail = head;
        }
        size++;
    }

    public void insertEnd(int val){
        Node ptr = head;
        while (ptr.next!=null) {
            ptr = ptr.next;
        }
        Node node = new Node(val);
        ptr.next = node;
        ptr = node;
        size++;
    }

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertEnd(val);
            return;
        }
        Node temp = head;
        for (int i=1; i<index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    public void deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head==null){
            tail = null;
        }
        size--;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void deleteEnd() {
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
    }

    public void delete(int index) {
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==size-1) {
            deleteEnd();
            return;
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
    }

    public Node find(int val) {
        Node node = head;
        while (node!=null){
            if (node.value==val){
                return node;
            }
        }
        return null;
    }

    public void printList(){
        Node ptr = head;
        while (ptr!=null) {
            System.out.print(ptr.value + " -> ");
            ptr = ptr.next;
        }
        System.out.println("END");
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}