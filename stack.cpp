#include <cstdio>
#include <cstdlib>

public class Stack<T>{
  private stackNode<T>{
    private T data;
    private StackNode<T> next;

    public stackNode(T data){
      this.data = data;
    }
  }

  private stackNode<T> top;
  //(3.2)getting minimum value at O(1)
  private T min;
  public T pop(){
    if(top.data == NULL) throw new EmptyStackExeption();
    T value = top.data;
    top = top.next;
    return value;
  }

  public void push(T value){
    private stackNode<T> newNode;
    //3.2 -----------------------------
    if(min==NULL){
      min = value;
    }else{
      if(value < min){
        min = value;
      }
    }
    //----------------------------------
    newNode.data = value;
    newNode.next =  top;
    top = newNode;
  }

  public T peek(){
    if(top.data == NULL) throw new EmptyStackExeption();
    return top.data;
  }
  public boolean isEmpty(){
    return top == null;
  }

  //3.2-------------------------
  public T getMin(){
    return min;
  }
  //----------------------------
}
