package data.structure.linkedlist;


public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLinkedList(int nodeValue) {

        //  head= new Node();
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        newNode.nextReference = null;
        tail = newNode;
        head = newNode;
        size = 1;

        return head;
    }

    /**
     * This method is used to insert node a the end of the
     * LinkedList
     *
     * @param nodeValue
     * @return head
     */
    public Node insertLinkedListAtLast(int nodeValue) {
        Node referenceNode = head;
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        newNode.nextReference = null;
        for (int i = 0; i < size; i++) {
            if (referenceNode.nextReference == null) {
                referenceNode.nextReference = newNode;
                tail = newNode;
            }
            referenceNode = referenceNode.nextReference;
        }
        size++;
        return head;
    }

    /**
     * This method is used to insert node at spefic location of the
     * Likeliest
     *
     * @param nodeValue
     * @param location
     * @return head
     */
    public void insertAtLocationtLinkedList(int nodeValue, int location) {
        Node previousNode = head;
        Node referenceNode = head;
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;
        if (location == 0) {
            newNode.nextReference = head;
            head = newNode;
        } else if (location == size) {
            newNode.nextReference = null;
            tail.nextReference = newNode;
        } else {
            for (int i = 1; i < size; i++) {
                if (i == location) {
                    newNode.nextReference = referenceNode;
                    previousNode.nextReference = newNode;
                }
                previousNode = previousNode.nextReference;
                referenceNode = previousNode.nextReference;
            }
        }
        size++;
    }

    public void traverseLinkedList() {

        Node tempNode = head;
        if (head == null) {
            System.out.print("Empty Linked List");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.nodeValue);
            if (i < size - 1) {
                System.out.print("-->");
            }
            tempNode = tempNode.nextReference;
        }
        System.out.println();
    }

    public int searchInLinkedList(int searchValue) {
        int index = Integer.MAX_VALUE;
        Node tempNode = head;
        if (head == null) {
            System.out.print("Empty Linked List");

        }
        for (int i = 0; i < size; i++) {
            if (tempNode.nodeValue == searchValue) {
                index = i;
            }
            tempNode=tempNode.nextReference;

        }

        return index;
    }

    public void DeleteInLinkedList(int location){
        int index = Integer.MAX_VALUE;
        Node tempNode = head;
        if (head == null) {
            System.out.print("Empty Linked List");

        }
        for (int i = 0; i < location-1; i++) {
            tempNode=tempNode.nextReference;

        }
        Node deletNode=tempNode.nextReference;
        tempNode.nextReference=deletNode.nextReference;
        deletNode.nextReference=null;
        size--;
    }

}

