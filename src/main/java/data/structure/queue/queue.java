package data.structure.queue;

public class queue {
    int[] queueArray;
    int front;
    int rear;

    public void create(int size){
        queueArray = new int[size];
        front=0;
        rear=0;
        System.out.println("Created queue");
    }

    public void enqueue(int value){

        if(rear!=queueArray.length-1) {
            queueArray[rear] = value;
            System.out.println("queued");
            rear++;
        }else{
            System.out.println("queue is full");
        }
    }

    public void dequeue(){
        if(rear!=queueArray.length-1) {
            System.out.println("dequeued"+queueArray[front]);
            queueArray[front]=-1;
            front++;
        }
    }
}
