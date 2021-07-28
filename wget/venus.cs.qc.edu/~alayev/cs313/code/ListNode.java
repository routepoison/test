/**
 *  ListNode.java
 *  ListNode class
 *
 *  Author: Yosef Alayev
 */

public class ListNode
{
    private Comparable data;
    private ListNode next;

    // zero-argument constructor
    public ListNode()
    {
        data = null;
        next = null;
    }

    // one-argument constructor
    public ListNode(Comparable x)
    {
        data = x;
        next = null;
    }

    // two-argument constructor
    public ListNode(Comparable x, ListNode nextListNode)
    {
        data = x;
        next = nextListNode;
    }

    // Accessors
    public Comparable getData ()
    {
        return data;
    }
    public ListNode getNext ()
    {
        return next;
    }

    // Mutators
    public void setData(Comparable x)
    {
        data = x;
    }

    public void setNext(ListNode nextListNode)
    {
        next = nextListNode;
    }
}