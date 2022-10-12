package com.pratham;

public class CircularQueue {
    static int front = -1;
    static int rear = -1;
    static int size = 5;
    static int[] cq = new int[size];

    public static void main(String[] args) {
        // insertion
        System.out.println("Displaying after insertion");
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        display();

        // deletion
        dequeue();
        dequeue();

        System.out.println("Displaying after deletion: ");
        display();

        // again inserting element to check if queue is behaving as circular queue
        enqueue(6);
        enqueue(7);

        // displaying after inserting again
        System.out.println("Displaying after inserting again");
        for (int x : cq) {
            System.out.print(x + " ");
        }
    }

    static void display() {
        for (int i = front; i <= rear; i++) {
            System.out.println(cq[i]);
        }
    }

    static boolean isFull() {
        return front == (rear + 1) % size;
    }

    static boolean isEmpty() {
        return front == -1;
    }

    static void enqueue(int val) {
        if (!isFull()) {
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
            } else if (rear == size - 1 && front != 0) {
                rear = 0;
            } else {
                rear = (rear + 1) % size;
            }
            cq[rear] = val;
        }
    }

    static void dequeue() {
        if (!isEmpty()) {
            int temp = cq[front];
            if (front == rear) {
                front = rear = -1;
            } else if (front == size - 1) {
                front = 0;
            } else {
                front = (front + 1) % size;
            }
        }
    }
}
