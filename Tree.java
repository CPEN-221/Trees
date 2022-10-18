public interface Tree {
    /* return the left subtree */
    Tree leftSubTree();

    /* return the right subtree */
    Tree rightSubTree();

    /* is empty tree? */
    boolean isEmptyTree();

    /* return the value associated with the root
       if the tree is not empty.
       @requires isEmptyTree() is false */
    int value();

    /* print the values in the tree in order */
    void traverse_inorder();

    /* print the values in the tree, in preorder */
    void traverse_preorder();

    Tree insert(int val);
}