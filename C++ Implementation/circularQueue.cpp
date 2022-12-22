#include<iostream>
using namespace std;
class cqueue{
    int front;
    int rear;
    int size;
    int *arr;
    public:
        cqueue(int size){
            this->size = size;
            front=rear=-1;
            arr = new int[size];
        }

        bool isFull(){
            return (front==(rear+1)%size);
        }

        bool isEmpty(){
            return front==-1;           
        }

        void enqueue(int val){
            if(!isFull()){
                if(front==-1){
                    front=0;
                }
                if(rear==size-1 && front!=0){
                    rear=0;
                    arr[rear] = val;
                } else{
                    rear++;
                    arr[rear] = val;
                }
            } else{
                cout << "Queue is Full" << endl;
            }
        }

        void dequeue(){
            if(!isEmpty()){
                int val = arr[front];
                if(front==rear){
                    front=rear=-1;
                } else if(front==size-1){
                    front=0;
                } else{
                    front++;
                }
            } else{
                cout << "Queue is Empty" << endl;
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
    cqueue cq(5);
    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.enqueue(40);
    cq.enqueue(50);
    cq.display();

    cq.dequeue();
    cq.dequeue();
    cout << "After deleting 2 elements: " << endl;
    cq.display();

    return 0;
}