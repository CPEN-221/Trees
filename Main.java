class Main {
  public static void main(String[] args) {
    Tree myTree = new Node(10);
    myTree.insert(5);
    myTree.insert(12);
    myTree.insert(1);
    myTree.insert(45);
    myTree.insert(-7);
    myTree.insert(59);
    System.out.println("Inorder Traversal");
    myTree.traverse_inorder();
    System.out.println("\nPreorder Traversal");
    myTree.traverse_preorder();
  }
}