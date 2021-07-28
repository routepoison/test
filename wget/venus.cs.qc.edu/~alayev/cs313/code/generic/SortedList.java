/**
 *  SortedList.java
 *  Generic Sorted List class
 *
 *  Author: Yosef Alayev
 */

public class SortedList<E extends Comparable<? super E>>
{
    private ListNode<E> head;

    public SortedList()
    {
        head = null;
    }

    // insert data x in sorted order
    public void insert(E x)
    {
        ListNode<E> curr = head, prev = null;

        while(curr != null && x.compareTo(curr.getData()) > 0)
        {
            prev = curr;
            curr = curr.getNext();
        }

        if (prev == null)
        {
            head = new ListNode<E>(x, curr);
        }
        else
        {
            prev.setNext(new ListNode<E>(x, curr));
        }
    }

    // remove one copy of x from sorted list
    // return true if removal is successful
    public boolean delete(E x)
    {
        if (head == null)
            return false;
        ListNode<E> curr = head, prev = null;

        while(curr != null && x.compareTo(curr.getData()) > 0)
        {
            prev = curr;
            curr = curr.getNext();
        }

        if (curr == null || x.compareTo(curr.getData()) != 0)
            return false;

        if (prev == null)
            head = curr.getNext();
        else
            prev.setNext(curr.getNext());

        return true;
    }

    public void output()
    {
        for (ListNode<E> curr = head; curr != null; curr = curr.getNext())
        {
            System.out.println(curr.getData());
        }
    }
}