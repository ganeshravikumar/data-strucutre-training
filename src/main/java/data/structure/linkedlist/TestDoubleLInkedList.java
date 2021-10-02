package data.structure.linkedlist;

public class TestDoubleLInkedList {

    public static void main(String[] args) {
        DoubleLinkedList dLL= new DoubleLinkedList();
        DoubleNode head = dLL.createDoubleLinkedList(1);
        dLL.traverse();
        dLL.insertDoubleLinkedList(2,0);
        dLL.insertDoubleLinkedList(3,1);
        dLL.insertDoubleLinkedList(4,3
        );
        System.out.println(dLL.size);
        dLL.traverse();


    }
}
