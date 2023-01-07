package com.pratham.DS;

public class StackDemo {
    static int top = -1;
    static int size = 5;
    static int[] s = new int[size];

    public static void main(String[] args) {

        // inserting 5 elements
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);

        // displaying
        System.out.println("Displaying after insertion: ");
        display();

        // deleting 2 elements
        pop();
        pop();

        // displaying
        System.out.println("Displaying after deletion: ");
        display();
    }

    static void display(){
        if (isEmpty()){
            return;
        }
        for(int i=0;i<=top;i++){
            System.out.println(s[i] + " ");
        }
    }

    static void pop(){
        if (!isEmpty()){
            top--;
        }
    }

    static void push(int num) {
        if (!isFull()){
            top++;
            s[top] = num;
        }
    }

    static boolean isFull(){
        return top == size - 1;
    }

    static boolean isEmpty(){
        return top == -1;
    }
}
