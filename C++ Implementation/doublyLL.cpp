#include<iostream>
using namespace std;
class Node{
    int data;
    Node *head;
    Node *next,*prev;

    public:
        Node(){
            head = NULL;
            prev=next=NULL;
        }

        void insertBegin(int data){
            if(head==NULL){
                Node* newNode = new Node();
                newNode->data = data;
                head = newNode;
            } else{
                Node* newNode = new Node();
                newNode->data = data;
                Node* ptr = head;
                newNode->next = ptr->prev;
                ptr->prev = newNode;
                head = newNode;
            }
        }

        void insertEnd(int data){
            if(head==NULL){
                Node* newNode = new Node();
                newNode->data = data;
                head = newNode;
            } else{
                Node* newNode = new Node();
                newNode->data = data;
                newNode->next = NULL;
                Node *ptr = head;
                while (ptr->next!=NULL){
                    ptr = ptr->next;
                }
                ptr->next = newNode;
                newNode->prev = ptr;
            }
        }

        void insertBefore(int ele, int data){
            Node* newNode = new Node();
            newNode->data = data;
            Node* ptr = head;
            Node* temp = head;
            while (ptr->data!=ele){
                temp = ptr;
                ptr = ptr->next;
            }
            newNode->next = temp->next;
            ptr->prev = newNode;
            temp->next = newNode;
            newNode->prev = temp;
        }

        void deleteBegin(){
            Node* ptr = head;
            Node* temp = head;
            ptr = ptr->next;
            ptr->prev = NULL;
            head = ptr;
            delete temp;
        }

        void deleteEnd(){
            Node* ptr = head;
            while (ptr->next!=NULL){
                ptr = ptr->next;
            }
            Node* temp = ptr->prev;
            temp->next = NULL;
            delete ptr;
        }

        void deleteBefore(int ele){
            Node* ptr = head;
            while(ptr->data!=ele){
                ptr=ptr->next;
            }
            Node* temp = ptr->prev;
            Node* helper = temp->prev;
            helper->next = ptr;
            ptr->prev = helper;
            delete temp;
        }

        void display(){
            Node* ptr = head;
            while (ptr!=NULL){
                cout << ptr->data << " ";
                ptr = ptr->next;
            }
            cout << endl;
        }
};
int main()
{
    Node ll;
    ll.insertBegin(10);
    ll.insertEnd(20);
    ll.insertEnd(30);
    ll.insertEnd(50);
    ll.insertBefore(50,40);
    ll.display();

    ll.deleteBegin();
    ll.display();
    ll.deleteEnd();
    ll.display();
    ll.deleteBefore(40);
    ll.display();

    

    return 0;
}