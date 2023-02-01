package com.pratham.LinkedLists;

public class CircularLL {
    class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public int size(){
        return this.size;
    }
    public void insert(int val) {
        Node node = new Node(val);
        if (head==null) {
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val){
        Node node = head;
        if (node==null) {
            return;
        }
        if (node.val==val){
            head = head.next;
            tail.next = node;
            size--;
            return;
        }
        do{
            Node n = node.next;
            if (n.val==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node!=head);
        size--;
    }

    public void printlist() {
        Node node = head;
        do{
            System.out.print(node.val + "->");
            node = node.next;
        } while (node!=head);
        System.out.println("HEAD");
    }

}
