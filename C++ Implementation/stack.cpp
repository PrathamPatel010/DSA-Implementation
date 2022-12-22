#include<iostream>
using namespace std;
class StackDemo{
    int top;
    int size;
    int *arr;
    public: 
        StackDemo(int size){
            top=-1;
            this->size=size;
            arr = new int[size];
        }

        bool isFull(){
            return top==size-1;
        }

        bool isEmpty(){
            return top==-1;
        }

        void push(int val){
            if(!isFull()){
                top++;
                arr[top] = val;
            } else{
                cout << "Stack Overflow" << endl;
            }
        }

        void pop(){
            if(!isEmpty()){
                int val=arr[top];
                top--;
            } else{
                cout << "Stack is Empty" << endl;
            }
        }

        int peep(){
            if(!isEmpty()){
                return arr[top];
            } else{
                cout << "Stack is Empty" << endl;
            }
        }

        void display(){
            for(int i=0;i<=top;i++){
                cout << arr[i] << " ";
            }
            cout << endl;
        }
};
int main()
{
    StackDemo s(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);

    s.display();

    s.pop();
    s.pop();
    cout << "After deletion, Element at top is: " << s.peep();

    return 0;
}