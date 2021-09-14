class BubbleSort 
{
  public static <T extends Comparable<T>> void bubbleSort (T[] list, int size) 
  {
    int swap = 1, i,j; 
    T temp;
    
    for (i = size - 1; i > 0 ; i--)
    {
      swap = 0;
      for (j= 0; j < i; j++)
      {
        if (list[j].compareTo(list[j+1]) > 0)
        {
          temp = list[j];
          list[j] = list[j+1];
          list[j+1] = temp;
          swap = 1;
        }
      }
    }
  }
}
 
public class Bubblegen
{
  public static void main (String[] args)
  {
    Integer arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    System.out.println("Array: ");
    for(Integer i :arr)
    {
      System.out.println(i);
    }
    BubbleSort.bubbleSort(arr, arr.length);
   
    System.out.println("Sorted Array: ");
    for(Integer i :arr)
    {
      System.out.println(i);
    }
  }
}