package data.structure.linkedlist;

import java.util.Objects;

public class CircularSingleLinkedList {
    public Node head;
    public Node tail;
    public int size;



    /**
     * Create Cicular single linked list with one node
     * Time and space complexity is O(1)
     *
     * @param nodeValue
     * @return
     */
    public Node CreateCSLL(int nodeValue) {
        Node node = new Node();
        head = node;
        tail = node;
        node.nextReference = node;
        node.nodeValue = nodeValue;
        size++;
        return head;
    }

    /**
     * This method will insert new node at the last
     * Time and space complexity is O(1) for insert at first and last
     * Time Complexity O(n) for inserting at other location
     * Space Complexity is O(1) for all
     *
     * @param nodeValue
     * @param location
     */
    public void insert(int nodeValue, int location) {
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        if (head == null) {
            System.out.println("CLSS does not exist");
        } else if(location >= size){
            tail.nextReference = newNode;
            tail = newNode;
            tail.nextReference = head;
        }else if(location==0){
            newNode.nextReference=head;
            head=newNode;
            tail.nextReference=head;
        }
        else{
            Node tempNode= head;
            for(int i=1;i<location;i++){
                tempNode = tempNode.nextReference;
            }
            newNode.nextReference=tempNode.nextReference;
            tempNode.nextReference=newNode;


        }

        size++;
    }

    /**
     * This method will delete the node in th circular
     * Space Complexity -O(1)
     * time complexityl -O(n)
     */
    public void deletionOfNode(int location){
        Node tempNode= head;
        for(int i=1;i<location;i++){
            tempNode = tempNode.nextReference;
        }
        Node delNode = tempNode.nextReference;
        tempNode.nextReference= delNode.nextReference;
        delNode.nextReference=null;
        size--;
    }


    /**
     * This method to traverse to all element in the linked list
     * Space Complexity O(1)
     * Time Complexity O(n)
     */
    public void traverse() {
        Node tempNode = head;
        if (head == null) {
            System.out.println("CLSS does not exist");
        }
        for (int i = 0; i < size; i++) {
            System.out.print(Objects.requireNonNull(tempNode).nodeValue);
            System.out.print("-->");
            tempNode = tempNode.nextReference;
        }

        System.out.println();
    }

}
