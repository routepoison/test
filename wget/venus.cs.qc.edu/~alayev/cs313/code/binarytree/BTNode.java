/**
 * Class that represents a Node of a Binary Tree
 * Author: Yosef Alayev
 */

public class BTNode
{
    private Comparable data;
    private BTNode left;
    private BTNode right;

    // zero-argument constructor
    public BTNode()
    {
        data = null;
        left = right = null;
    }

    // one-pargument constructor
    public BTNode(Comparable x)
    {
        data = x;
        left = right = null;
    }

    // three-argument constructor
    public BTNode(Comparable x, BTNode l, BTNode r)
    {
        data = x;
        left = l;
        right = r;
    }

    // Mutators
    public void setData(Comparable x) { data = x; }
    public void setLeft(BTNode l) { left = l; }
    public void setRight(BTNode r) { right = r; }

    // Accessors
    public Comparable getData() { return data; }
    public BTNode getLeft() { return left; }
    public BTNode getRight() { return right; }
}