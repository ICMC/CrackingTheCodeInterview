#include <cstdio>
#include <cstdlib>

public class Stack<T>{
  private stackNode<T>{
    private T data;
    private StackNode<T> next;
  }

  private stackNode<T> top;

  public T pop(){
    if(top.data == NULL) throw new EmptyStackExeption();
    T value = top.data;
    top = top.next;
    return value;
  }

  public void push(T value){
    private stackNode<T> newNode;
    newNode.data = value;
    newNode.next =  top;
    top = newNode;
  }

  public T peek(){
    if(top.data == NULL) throw new EmptyStackExeption();
    return top.data;
  }
  public boolen(){
    return top == null;
  }
}
