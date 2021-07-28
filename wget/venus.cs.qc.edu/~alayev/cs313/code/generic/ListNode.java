/**
 *  ListNode.java
 *  Generic ListNode Class
 *
 *  Author: Yosef Alayev
 */

public class ListNode<E>
{
    private E data;
    private ListNode<E> next;

    // no-argument constructor
    public ListNode()
    {
        data = null;
        next = null;
    }

    // one-argument constructor
    public ListNode(E x)
    {
        data = x;
        next = null;
    }

    // two-argument constructor
    public ListNode(E x, ListNode<E> nextListNode)
    {
        data = x;
        next = nextListNode;
    }

    // Accessors
    public E getData ()
    {
        return data;
    }
    public ListNode<E> getNext ()
    {
        return next;
    }

    // Mutators
    public void setData(E x)
    {
        data = x;
    }

    public void setNext(ListNode<E> nextListNode)
    {
        next = nextListNode;
    }
}