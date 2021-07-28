public class BinaryTreeTest
{
    public static void main(String args[])
    {
        BinaryTree tree1 = new BinaryTree(4);
        BinaryTree tree2 = new BinaryTree(10);
        BinaryTree tree3 = BinaryTree.merge(5, tree1, tree2);

        BinaryTree tree4 = new BinaryTree(40);
        BinaryTree tree5 = new BinaryTree(1);
        BinaryTree tree6 = BinaryTree.merge(15, tree4, tree5);

        BinaryTree tree7 = BinaryTree.merge(100, tree3, tree6);

        System.out.println(tree7.inorder());
    }
}