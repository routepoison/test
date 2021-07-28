/**
 *  Iterator.java
 *  Iterator class
 *
 *  Author: Yosef Alayev
 */
public class Iterator
{
    private ListNode node;

    // initialize an iterator
    public Iterator(ListNode n)
    {
        node = n;
    }

    // check if has next
    public boolean hasNext()
    {
        return (node != null);
    }

    // return next and advance
    public Object next()
    {
        Object x = null;

        if(hasNext())
        {
            x = (Object) node.getData();
            node = node.getNext();
        }

        return x;
    }
}
