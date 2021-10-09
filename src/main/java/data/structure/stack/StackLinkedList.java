package data.structure.stack;

public class StackLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public void Create(){
        head =null;
        tail=null;
        size=0;
    }


    public void push(int nodeValue){
        Node newNode = new Node();
        newNode.nodeValue=nodeValue;

        if(head==null){
            newNode.nextreference = null;
            tail=newNode;
            head=newNode;
        }
        else{
            newNode.nextreference=head;
            head=newNode;
           // head.nextreference=newNode;

        }
size++;
    }

    public void pop(){
        if(size>0) {
          head=head.nextreference;
          size--;
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    public void peek(){
        if(head!=null) {
            System.out.println(head.nodeValue);
        }
        else{
            System.out.println("Stack is empty");
        }
    }
}
