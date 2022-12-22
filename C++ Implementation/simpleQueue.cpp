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
            return rear==size-1;
        }

        bool isEmpty(){
            return front==-1;
        }

        void enqueue(int val){
            if(!isFull()){
                rear++;
                arr[rear] = val;
                if(front==-1){
                    front=0;
                }
            } 
            else{
                cout << "Queue is Full" << endl;
            }
        }

        void dequeue(){
            if(!isEmpty()){
                int val = arr[front];
                front++;
            } else{
                cout << "Queue is empty" << endl;
            }
        }

        void display(){
            for(int i=front;i<=rear;i++){
                cout << arr[i] << " ";
            }
            cout << endl;
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