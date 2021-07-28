public class Stack
{
   private Node top;
   private int count;

   public Stack()
   {
      top = null;
      count = 0;
   }

   public boolean isEmpty()
   {
      return (top == null);
   }

   public void push(Object x)
   {
      top = new Node(x, top);
      count++;
   }

   public Object pop()
   {
      if (top == null)
         return null;

      Node oldTop = top;
      top = top.getNext();
      count--;

      return oldTop.getData();
   }

   public Object peek()
   {
      if (top == null)
         return null;
      return top.getData();
   }

   public int size()
   {
      return count;
   }
}