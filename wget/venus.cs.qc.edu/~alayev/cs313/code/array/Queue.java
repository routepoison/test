public class Queue
{
   private Object data[];
   private int rear;
   private int front;
   private int count;
   private final int DEFAULT_CAP = 10;

   public Queue()
   {
      data = new Object[DEFAULT_CAP];
      count = 0;  
   }

   public Queue(int initCap)
   {
      if (initCap < 0) {
         data = new Object[DEFAULT_CAP];
         System.out.println("Error: Capacity < 0");
         System.out.println("DEFAULT_CAPACITY = 10");
      }
      else 
         data = new Object[initCap];
      count = 0;  
   }

   public boolean isEmpty()
   {
      return (count == 0);
   }

   public void insert(Object item)
   {
      if (count == data.length)
        ensureCapacity(2 * data.length + 1);
      if (count == 0)
         front = rear = 0;
      else
         rear = (rear + 1) % data.length;
      data[rear] = item;
      count++;
   }

   public Object delete()
   {
      if (count == 0) 
         return null;
      Object answer = data[front];
      front = (front + 1) % data.length;
      count--;

      return answer;
      
   }

   public Object peek()
   {
      if (count == 0)
         return null;
      return data[front];
   }

   public int size()
   {
      return count;
   }

   public void ensureCapacity(int minCap)
   {
      Object biggerArray[];
      int n1, n2;

      if (minCap <= data.length)
         return;

      if (count == 0)
         data = new Object[minCap];
      else if (front <= rear)
      {
         biggerArray = new Object[minCap];
         System.arraycopy(data, front, 
                          biggerArray, front, count);
         data = biggerArray;
      } 
      else
      {
         biggerArray = new Object[minCap];
         n1 = data.length - front;
         n2 = rear + 1;
         System.arraycopy(data, front, biggerArray, 0, n1);
         System.arraycopy(data, 0, biggerArray, n1, n2); 
         data = biggerArray;
         rear = count - 1;
         front = 0;
      }
   }
}