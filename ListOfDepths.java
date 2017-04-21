


ArrayList<LinkedList> depthList(Node root, int i){
    int i = 0;
    ArrayList<LinkedList> list;
    createDepthList(list, root, i);
}

void createDepthList(ArrayList<LinkedList> list, Node n, int i){

    if(!n.hasChildNode()){
      return n;
    }
  
    LinkedList<Node> list = new LinkedList<Node>;
    if(list.get(i)==null){
      LinkedList<Node> linked = new LinkedList<Node>;
      list.add(i, linked);
    }
    LinkedList<Node> l = new LinkedList<Node>;
    l = list.get(i);
    l.add(n);
    createDepthList(list, n.left, i+1);
    createDepthList(list, n.right, i+1);

}
