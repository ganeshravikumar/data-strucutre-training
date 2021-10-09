package data.structure.stack;

public class StackArrayDS {

    int[] stackArray;
    int topOftheStack;

    public void creatStack(int size) {
        stackArray = new int[size];
        topOftheStack = -1;
        System.out.println("Stack Created ...");
    }

    public boolean isEmpty() {
        if (topOftheStack == -1) {
            System.out.println("Stack is empty");
            return true;
        }
            return false;
    }
    public boolean isFull(){
        if(topOftheStack==stackArray.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public void push(int value){
        if(!isFull()){
            topOftheStack++;
            stackArray[topOftheStack]=value;
            System.out.println("Pushed value to Stack ");
        }
        else{
            System.out.println("Stack is full");
        }
    }

    public void pop(){
        if(!isEmpty()){
            int popValue =stackArray[topOftheStack];
            stackArray[topOftheStack]=-1;
            topOftheStack--;
            System.out.println("poped value from Stack "+popValue);
        }
        else{
            System.out.println("Stack is empty");
        }
    }

    public int peek(){
        if(!isEmpty()){
            int popValue =stackArray[topOftheStack];
           return popValue;
        }
        else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
}
