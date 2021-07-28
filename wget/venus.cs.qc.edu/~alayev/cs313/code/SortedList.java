/**
 *  SortedList.java
 *  SortedList class
 *
 *  Author: Yosef Alayev
 */

public class SortedList
{
    private ListNode head;

    // create empty list
    public SortedList()
    {
        head = null;
    }

    // insert data x in sorted order
    public void insert(Comparable x)
    {
        ListNode curr = head, prev = null;

        while(curr != null && x.compareTo(curr.getData()) > 0)
        {
            prev = curr;
            curr = curr.getNext();
        }

        if (prev == null)
        {
            head = new ListNode(x, curr);
        }
        else
        {
            prev.setNext(new ListNode(x, curr));
        }
    }

    // remove one copy of data x from the sorted list
    // return true if removal was successful
    public boolean delete(Comparable x)
    {
        if (head == null)
            return false;
        ListNode curr = head, prev = null;

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

    // output contents of the sorted list
    public void output()
    {
        for (ListNode curr = head; curr != null; curr = curr.getNext())
        {
            System.out.println(curr.getData());
        }
    }
}