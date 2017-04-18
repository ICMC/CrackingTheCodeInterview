#include <cstdio>
#include <cstdlib>

public class Queue<T>{
  private QueueNode<T>{
    private T data;
    private QueueNode<T> next;

    private QueueNode(T data){
      this.data = data;
    }
  }

  private QueueNode<T> head;
  private QueueNode<T> tail;

  public add(T value){
    private QueueNode<T> newNode;
    newNode.data = value;
    if(isEmpty()){
      head = newNode;
      tail = newNode;
    }else{
      tail.next = newNode;
      tail = newNode;
    }
  }

  public T remove(){
       if(head.data == null) throw new EmptyQueueExeption();
       T value =  head.data;
       head = head->next;
       return value;
  }

  private boolean isEmpty(){
    return head == null;
  }
}
