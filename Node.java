public class Node implements Tree {
    private Tree leftSubTree;
    private Tree rightSubTree;
    private int value;

    public Node(int value) {
        this.value = value;
        this.leftSubTree = EmptyTree.emptyTree();
        this.rightSubTree = EmptyTree.emptyTree();
    }

    public Tree leftSubTree() {
        return this.leftSubTree;
    }

    public Tree rightSubTree() {
        return this.rightSubTree;
    }

    public int value() {
        return this.value;
    }

    public boolean isEmptyTree() {
        return false;
    }

    public Tree insert(int val) {
        if (this.value == val) {
            return this;
        }

        if (this.value > val) {
            leftSubTree = leftSubTree.insert(val);
        } else {
            rightSubTree = rightSubTree.insert(val);
        }

        return this;
    }

    public void traverse_inorder() {
        this.leftSubTree.traverse_inorder();
        System.out.println(this.value);
        this.rightSubTree.traverse_inorder();
    }

    public void traverse_preorder() {
        this.leftSubTree.traverse_preorder();
        this.rightSubTree.traverse_preorder();
        System.out.println(this.value);
    }
}