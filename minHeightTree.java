import
import java.lang.Object;

Public class Tree{
  public Node minHeight(ArrayList<int> str){
     Node n = new Node<int>;
     if(str.size()==1){
       n.setNodeValue(str.get(0));
       return n;
     }
     int halfSize = str.size()/2;
     int size = str.size();
     ArrayList<int> left = str.subList(0,halfSize -1);
     ArrayList<int> right = str.subList(halSize; size -1);
     n.appendChild(minHeight(left));
     n.appendChild(minHeight(right));
     return n;
  }

  public static void main(String[] args)
 {
    ArrayList<int> array = new ArrayList<int>;
    for(int i=0; i < 20; i++){
      array.add(i);
    }
    Node root = new Node<int>;

    root = minHeight(array);
 }

}
