package data.structure.linkedlist;

public class CircularDoubleLinkedList {
    DoubleNode head;
    DoubleNode tail;
    int size;

    public DoubleNode createDoubleLinkedList(int nodeValue){

        DoubleNode newNode = new DoubleNode();
        newNode.nodeValue= nodeValue;
        newNode.nextNode= newNode;
        newNode.previousNode=newNode;
        head=newNode;
        tail=newNode;
        size++;
        return head;
    }

    public void traverse(){
        DoubleNode tempNode= new DoubleNode();
        tempNode=head;
        if(head==null){
            System.out.println("There is no list avaiable");
        }
        for (int i = 0; i < size; i++) {
            System.out.print("-->");
            System.out.print(tempNode.nodeValue);
            tempNode=tempNode.nextNode;
        }
        System.out.println();

    }
    public void insert(int nodeValue, int location){
        DoubleNode newNode= new DoubleNode();
        newNode.nodeValue=nodeValue;
        if(location==0){
            newNode.nextNode=head;
            tail.nextNode=newNode;
            newNode.previousNode=tail;
            head=newNode;
        }
        else if(location>=size){
            tail.nextNode=newNode;
            head.previousNode=newNode;
            newNode.nextNode=head;
            tail=newNode;
        }
        else {
            DoubleNode tempNode= new DoubleNode();
            tempNode=head;
            for (int i = 0; i < location; i++) {
                tempNode=tempNode.nextNode;
            }
            newNode.nextNode=tempNode.nextNode;
            tempNode.nextNode.previousNode=newNode;
            tempNode.nextNode=newNode;
            newNode.previousNode=tempNode;

        }

        size++;
    }

}
