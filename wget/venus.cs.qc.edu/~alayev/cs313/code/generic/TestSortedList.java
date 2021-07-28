/**
 *  TestSortedList.java
 *  Test Generic SortedList class
 *
 *  Author: Yosef Alayev
 */

public class TestSortedList
{
    public static void main(String args[])
    {
        SortedList<Integer> list = new SortedList<Integer>();

        list.insert(5);
        list.insert(1);
        list.insert(10);
        list.insert(3);
        list.insert(7);

        list.output();

        System.out.println(list.delete(5));
        System.out.println(list.delete(5));
        System.out.println(list.delete(1));
        System.out.println(list.delete(10));
        System.out.println(list.delete(11));

        list.output();
    }
}