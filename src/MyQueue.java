//Array implementation of queue

public class MyQueue {
    int size;
    int queue[];
    int front;
    int rear;

    MyQueue(int size){
        this.size=size;
        this.queue= new int[size];
        this.front=-1;
        this.rear=-1;
    }
    public void enqueue(int element){
        if(front==-1){
            front+=1;
            rear+=1;
            queue[rear]=element;
            System.out.println("added element: "+queue[rear]);
        }
        else if(!isFull()){
            rear+=1;
            queue[rear]=element;
            System.out.println("added element: "+queue[rear]);
        }
        else{
            System.out.println("Queue is full!");
        }

    }
    public void dequeue(){
        if (!isEmpty()) {
        System.out.println("removed element: "+queue[front]);
        front+=1;
    }
        else{
            front=-1;
            rear=-1;
            System.out.println("Queue is empty!");
        }
    }

    private boolean isFull() {
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    private boolean isEmpty() {
        if(front>rear){

            return true;
        }
        else{
            return false;
        }
    }

    public void display(){
        System.out.println("------------ QUEUE -------------");
        if(front>-1 && front<size){
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }else{
            System.out.println("Queue is empty!");
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);

        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.display();
    }

}
