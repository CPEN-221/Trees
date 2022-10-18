public class EmptyTree implements Tree {

    private static boolean created = false;
    private static EmptyTree e;

    private EmptyTree() {
        // nothing to do, really!
    }

    public static Tree emptyTree() {
        if (!created) {
            e = new EmptyTree();
            created = true;
        }
        return e;
    }

    public boolean isEmptyTree() {
        return true;
    }

    public Tree leftSubTree() {
        return this;
    }

    public Tree rightSubTree() {
        return this;
    }

    public int value() {
        throw new UnsupportedOperationException("Can't do this with an empty tree");
    }

    public void traverse_inorder() {
        /* nothing to do */
        return;
    }

    public void traverse_preorder() {
        return;
    }

    public Tree insert(int val) {
        return new Node(val);
    }

}