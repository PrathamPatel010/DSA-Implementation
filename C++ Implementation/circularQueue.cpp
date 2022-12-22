#include<iostream>
using namespace std;
class squeue{
    int front;
    int rear;
    int size;
    int *arr;
    public:
        squeue(int size){
            this->size = size;
            front=rear=-1;
            arr = new int[size];
        }

        bool isFull(){
            
        }

        bool isEmpty(){
           
        }

        void enqueue(int val){
           
        }

        void dequeue(){

        }

        void display(){
            
        }
};
int main()
{
    squeue sq(5);
    sq.enqueue(10);
    sq.enqueue(20);
    sq.enqueue(30);
    sq.enqueue(40);
    sq.enqueue(50);
    sq.display();

    sq.dequeue();
    sq.dequeue();
    sq.display();

    return 0;
}