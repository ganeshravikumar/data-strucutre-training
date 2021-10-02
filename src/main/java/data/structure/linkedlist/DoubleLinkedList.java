package data.structure.linkedlist;

public class DoubleLinkedList {

    DoubleNode head;
    DoubleNode tail;
    int size;

    /**
     * This method is used to create  Double LinkedList
     * Space Complexity O(1)
     * Time Complexity O(1)
     * @param nodeValue
     * @return
     */
    public DoubleNode createDoubleLinkedList(int nodeValue) {

        DoubleNode newNode = new DoubleNode();
        newNode.nodeValue=nodeValue;
        newNode.previousNode=null;
        newNode.nextNode=null;
        head=newNode;
        tail=newNode;
        size=1;
        return head;
    }

    /**
     * Space Complexity O(1)
     * Time Complexity O(n)
     */
    public void traverse(){
        DoubleNode tempNode = head;
        if(size==0){
            System.out.println("List is empty");
        }
        for(int i=0; i<size;i++){
            System.out.print("-->");
            System.out.print(tempNode.nodeValue);
            tempNode=tempNode.nextNode;
        }
        System.out.println();
    }


    /**
     * Space Complexity O(1)
     * Time Complexity O(n)
     * @param nodeValue
     * @param location
     */
    public void insertDoubleLinkedList(int nodeValue, int location){
        DoubleNode newNode = new DoubleNode();
        newNode.nodeValue=nodeValue;
        if(head==null){
            createDoubleLinkedList(nodeValue);
            return;
        }
        if(location==0){
            newNode.nextNode=head;
            newNode.previousNode=null;
            head.previousNode=newNode;
            head=newNode;
        }
        else if(location>=size){
                    newNode.nextNode=null;
                    tail.nextNode=newNode;
                    newNode.previousNode=tail;
                    tail = newNode;

        }else {
            DoubleNode tempNode = new DoubleNode();
            tempNode =head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.nextNode;
            }
            tempNode.nextNode.previousNode=newNode;
            newNode.nextNode=tempNode.nextNode;
            newNode.previousNode=tempNode;
            tempNode.nextNode=newNode;

        }
        size++;
    }

}
