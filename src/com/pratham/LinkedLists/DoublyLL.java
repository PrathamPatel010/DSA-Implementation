package com.pratham.LinkedLists;

public class DoublyLL {
    class Node {
        private int val;
        private Node next;
        private Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private int size;
    DoublyLL() {
        this.size = 0;
    }
    public int size(){
        return this.size;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        if (head==null) {
            head = node;
            size++;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;
        size++;
    }

    public Node find(int index) {
        Node node = head;
        for (int i=1;i<index;i++){
            node = node.next;
        }
        return node;
    }

    public void insert(int val, int index) {
        if (index==0){
            insertFirst(val);
            size++;
            return;
        } else if (index==size){
            insertLast(val);
            size++;
            return;
        }
        Node ptr = find(index);
        if (ptr==null) {
            System.out.println("Does not exist!");
            return;
        }
        Node node = new Node(val);
        node.next = ptr.next;
        node.prev = ptr;
        ptr.next = node;
        node.next.prev = node;
        size++;
    }



    public void printlist(){
        Node node = head;
        Node last = null;
        while (node!=null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing in reverse: ");
        while (last!=null){
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("START");
    }
}
