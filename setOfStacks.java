
public class Stack<T>{
  private stackNode<T>{
    private T data;
    private T preMin; // 3.2
    private StackNode<T> next;

    public stackNode(T data){
      this.data = data;
    }
  }

  public stackNode<T> top;
  // 3.3
  public stackNode<T> bottom;
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
      bottom = newNode; // 3.3
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
    if(last.size == threshold){
       Stack newStack = new Stack(); // or pass the capacity/threshold as a parameter
       newStaack.push(v);
       setStack.add(newStack);
    }else{
      last.push(v);
    }
  }

  public int pop(){
    private Stack last = getLastStack();
    if(last.top == null) throw new EmptyQueueExeption();
    return last.pop;
  }

  public Stack getLastStack(){
    int index = setStack.size() - 1;
    return setStacks[index];
  }
  // assuming the user will assume the vectors position from 0 to n;
  public void popAt(int index){
    int value;
    if(setStack[index]==null) trow new EmptyQueueExeption();
    if(setStack[index+1]==null){
        return popStack.pop();
    }else{
        value = setStack[index].pop();
        while(setStack[index+1]!=null){
            setStack[index].top.next = setStack[index+1].bottom;
            setStack[index].top = setStack[index+1].bottom;
            if(setStack[index+1].size > 0){
              setStack[index+1].bottom = setStack[index+1].bottom.next;
            }
            index = index+1;
        }
    }
    return value;
  }

}
