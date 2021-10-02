package data.structure.linkedlist;

public class TestCirculareLinkedList {

    public static void main(String[] args) {

        CircularSingleLinkedList CLSS = new CircularSingleLinkedList();
        CLSS.CreateCSLL(1);
        CLSS.insert(2,1);
        CLSS.insert(3,2);
        CLSS.traverse();
        CLSS.insert(4,0);
        CLSS.traverse();
        CLSS.insert(5,2);
        CLSS.traverse();
        CLSS.deletionOfNode(2);
        CLSS.traverse();
        CLSS.insert(5,2);
        CLSS.traverse();
        CLSS.insert(0,0);
        CLSS.traverse();
        System.out.println(CLSS.size);
        CLSS.insert(6,6);
        CLSS.traverse();
    }
}
