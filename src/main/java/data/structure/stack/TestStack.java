package data.structure.stack;

public class TestStack {

    public static void main(String[] args) {
/*        StackArrayDS stack= new StackArrayDS();
        stack.creatStack(4);
        stack.isEmpty();
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());*/


        StackLinkedList SLL= new StackLinkedList();
        SLL.Create();
        SLL.push(1);
        SLL.push(2);
        SLL.push(3);
        SLL.peek();
        SLL.pop();
        SLL.peek();
        SLL.pop();
        SLL.peek();
        SLL.pop();
        SLL.peek();
    }

}
