#include<iostream>
using namespace std;
class Node{
    public:
        int data;
        Node* head;
        Node* next;

        Node(){
            head=NULL;
        }
        
        void insertBegin(int data){
            if(head==NULL){
                Node *newNode = new Node();
                newNode->data = data;
                head = newNode;
                newNode->next = head;
            }
            Node *ptr = head;
            while(ptr->next!=head){
                ptr = ptr->next;
            }
            Node *temp = head;
            Node *newNode = new Node();
            newNode->data = data;
            newNode->next = head;
            head = newNode;
            ptr->next = head;
        }

        void insertEnd(int data){
            Node *ptr = head;
            while (ptr->next!=head){
                ptr = ptr->next;
            }
            Node *newNode = new Node();
            newNode->data = data;
            ptr->next = newNode;
            newNode->next = head;
        }

        void insertBefore(int ele, int data){
            Node *newNode = new Node();
            newNode->data = data;
            Node *ptr = head;
            Node *temp = ptr;
            while (ptr->data!=ele){
                temp = ptr;
                ptr = ptr->next;
            }
            newNode->next = temp->next;
            temp->next = newNode;
        }

        void deleteBegin(){
            Node *ptr = head;
            ptr = ptr->next;
            head = ptr;
        }

        void deleteEnd(){
            Node *ptr = head;
            Node *temp = ptr;
            while (ptr->next!=NULL){
                temp = ptr;
                ptr = ptr->next;
            }
            temp->next = NULL;
            delete ptr;
        }

        void deleteBefore(int ele){
            Node *ptr = head;
            Node *temp = ptr;
            while (ptr->data!=ele){
                temp = ptr;
                ptr = ptr->next;
            }
            Node *helper = head;
            while(helper->next!=temp){
                helper = helper->next;
            }
            helper->next = ptr;
            delete temp;
        }

        void display(){
            Node *ptr = head;
            while (ptr->next!=head){
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
    ll.insertEnd(30);
    // ll.insertBefore(20,30);
    // ll.insertEnd(40);
    // ll.insertEnd(50);
    ll.display();
    // ll.deleteBegin();
    // ll.display();
    // ll.deleteEnd();
    // ll.display();
    // ll.deleteBefore(40);
    // ll.display();

    return 0;
}