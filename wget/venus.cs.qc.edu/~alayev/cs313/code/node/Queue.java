public class Queue
{
   private Node rear;
   private int count;

   public Queue()
   {
      rear = null;
      count = 0;
   }

   public boolean isEmpty()
   {
      return (rear == null);
   }

   public void insert(Object x)
   {
      if (rear == null)
      {
         rear = new Node(x);
         rear.setNext(rear);
      }
      else
      {
         rear.setNext(new Node(x, rear.getNext()));
         rear = rear.getNext();
      }
      count++;
   }

   public Object delete()
   {
      if (rear == null)
         return null;

      Object oldFront = rear.getNext().getData();
      if (rear == rear.getNext())
         rear = null;
      else
         rear.setNext(rear.getNext().getNext());
      count--;

      return oldFront;
   }

   public Object peek()
   {
      if (rear == null)
         return null;
      return rear.getNext().getData();
   }

   public int size()
   {
      return count;
   }
}