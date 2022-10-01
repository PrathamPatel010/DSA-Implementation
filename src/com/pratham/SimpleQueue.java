package com.pratham;

public class SimpleQueue {
    static int front = -1;
    static int rear = -1;
    static int size = 5;
    static int[] q = new int[size];

    public static void main(String[] args) {
        // inserting 5 elements
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);

        // displaying
        System.out.println("Displaying after insertion");
        display();

        // deleting 2 elements
        dequeue();
        dequeue();


        // displaying after delete
        System.out.println("Displaying after delete: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(q[i] + " ");
        }
    }

    static void display() {
        for (int i = 0; i <= rear; i++) {
            System.out.println(q[i] + " ");
        }
    }

    static void enqueue(int num) {
        if (!isFull()) {
            rear++;
            q[rear] = num;
        }
    }

    static void dequeue() {
        if (!isEmpty()) {
            front++;
        }
        front++;
    }

    static boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }
}
