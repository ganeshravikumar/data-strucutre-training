package data.structure.linkedlist;

public class TestCircularDoubleLinkedList {

    public static void main(String[] args) {
        System.out.println("testing");
        CircularDoubleLinkedList CDLL= new CircularDoubleLinkedList();
        CDLL.createDoubleLinkedList(1);
        System.out.println(CDLL.size);
        CDLL.traverse();
        CDLL.insert(2,0);
        CDLL.traverse();
        CDLL.insert(3,2);
        CDLL.traverse();
        CDLL.insert(4,1);
        CDLL.traverse();
    }
}
