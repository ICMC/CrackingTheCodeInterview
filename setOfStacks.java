
public class Stack<T>{
  private stackNode<T>{
    private T data;
    private T preMin; // 3.2
    private StackNode<T> next;

    public stackNode(T data){
      this.data = data;
    }
  }

  private stackNode<T> top;
  //(3.2)getting minimum value at O(1)
  private T min;
  private int size;

  public T pop(){
    if(top.data == NULL) throw new EmptyStackExeption();
    T value = top.data;
    min = top.prevMin;  // 3.2
    top = top.next;
    size--;
    return value;
  }

  public void push(T value){
    private stackNode<T> newNode;
    if(min==NULL){
      min = value;
      size = 1;
    }else{
      if(value < min){
        newNode.prevMin = min;
        min = value;
        size++;
      }
    }

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

  public T getMin(){
    return min;
  }
}


public class setOfStacks<int>{
  private setOfStacks<int>{
    private int threshold;

    public setOfStacks(int threshold){
      this.threshold = threshold;
    }
    public setOfStacks(){
      this.threshold = 20;
    }
  }
  private ArrayList<Stack> setStacks = new ArrayList<Stacks>;

  public void push(int v){
    private Stack last = getLastStack(); //who implements getLastStack??
    if(last.siz == threshold){
       Stack newStack = new Stack(); // or pass the capacity/threshold as a parameter
       newStaack.push(v);
       setStack.add(newStack);
    }else{
      last.push(v);
    }
  }
}
