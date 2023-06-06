//Array implemenatation of Stack

import java.util.*;
public class MyStack {
    int size;
    int stack[];
    int top;
    //create stack
    MyStack(int size){
        this.size=size;
        this.stack = new int[size];
        this.top=-1;
    }

    public void push(int element){
        if(!isFull()){
        top++;
        stack[top]=element;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public void pop(){
        if(!isEmpty()){
            System.out.println("popped element: "+stack[top]);
            top--;
        }
        else{
            System.out.println("Stack is Empty");
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("top element: "+stack[top]);
        }
        else{
            System.out.println("Stack is empty");
        }
    }
    public void display(){
        System.out.println("-------------------------------");
        if(top>-1) {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
        else{
            System.out.println("Stack is empty");
        }
        System.out.println("--------------------------------");
    }

    public boolean isFull(){
        if(top==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        stack.peek();
        stack.pop();
        stack.peek();

    }
}
