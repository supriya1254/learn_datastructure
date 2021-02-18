package array;

public class DeleteElement {

  public static void deleteFromEnd(int arr[]) {
    if(arr.length<=0)
      return;
    count--;
  }

  public static void deleteSpecificValue(int arr[],int value) {

    int i;
    for(i=0;i<count;i++)
    {
      if(arr[i] == value)
      {
        break;
      }
    }

    if(i==count)
    {
      System.out.print("value doesn't exist!!");
    }

    for(int j=i; j<count-1;j++) {
        arr[j] = arr[j+1];
    }
    count--;
  }

  public static void print(int arr[]) {
    for (int i =0; i < count; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  private static int count = 5;

  public static void main(String[] args) {
    int[] arr = {12,34,45,22,11};
 //   print(arr);
   deleteFromEnd(arr);
 //  print(arr);
   deleteSpecificValue(arr,45);
   print(arr);
  }
}