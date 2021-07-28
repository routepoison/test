public class Stack
{
   private Object data[];
   private int defaultSize;
   private final int increment = 5;
   private int count;

   public Stack()
   {
      defaultSize = 10;
      data = new Object[defaultSize];
      count = 0;  
   }

   public Stack(int stackSize)
   {
      defaultSize = stackSize;
      data = new Object[stackSize];
      count = 0;
   }

   public boolean isEmpty()
   {
      return (count == 0);
   }

   public void push(Object x)
   {
      if (count == defaultSize)
      {
         defaultSize += increment;
         Object temp[] = new Object[defaultSize];
         for (int i = 0; i < data.length; i++)
            temp[i] = data[i];
         data = temp;
      }
      data[count++] = x;
   }

   public Object pop()
   {
      if (count == 0)
         return null;
      return data[--count];
   }

   public Object peek()
   {
      if (count == 0)
         return null;
      return data[count - 1];
   }

   public int size()
   {
      return count;
   }
}