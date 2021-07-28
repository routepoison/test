public class BinaryTree
{
    private BTNode root;

    public BinaryTree()
    {
        root = null;
    }

    public BinaryTree(Comparable x)
    {
            root = new BTNode(x);
    }

    public static BinaryTree merge(Comparable x,
                                   BinaryTree leftTree,
                                   BinaryTree rightTree)
    {
        BinaryTree tree = new BinaryTree(x);
        tree.root.setLeft(leftTree.root);
        tree.root.setRight(rightTree.root);
        return tree;
    }

    // Inorder traversal of a Binary Tree
    public String inorder()
    {
        StringBuffer buf = new StringBuffer();
        if(root != null)
            inorder(root, buf);
        return buf.toString();
    }

    private void inorder(BTNode t, StringBuffer b)
    {
        if(t.getLeft() != null)
            inorder(t.getLeft(), b);
        b.append(t.getData() + " ");
        if(t.getRight() != null)
            inorder(t.getRight(), b);
    }


}