package array;

public class InsertElement {

  private static int count = 0;
  public static void main(String[] args) {

    int[] arr = new int[5];


    //insert through for loop
    /*for (int j = 0;j<arr.length;j++) {
      arr[j] = j;
    }*/

    //this for loop will use the method to insert the value of array
    for (int j = 0;j<arr.length;j++) {
      insert(arr,j+1);
    }

    //this loop is use for printing the value of array
   // printElement(arr);

    InsertInPosition(arr,2,6);

    printElement(arr);

  }

  private static void printElement(int[] arr) {
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]);
    }
  }

  public static void insert(int arr[],int val) {
    arr[count] = val;
    count++;
  }

  public static void InsertInPosition(int arr[], int position, int val) {
    for(int i=count-1;i>position;i--) {
      arr[i] = arr[i-1];
    }
    arr[position] = val;
  }

}
