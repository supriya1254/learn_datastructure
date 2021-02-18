package array;

// Java program to rotate an array by d elements
public class RotationArray {

  public static void rotateLeft(int[] num, int[] d, int n) {
    for(int i=0;i<d.length;i++) {
      rotateArray(num,n);
    }
  }

  public static void rotateArray(int num[],int n){
    int temp = num[0];
    int i;
    for(i=0;i<n-1;i++) {
      num[i] = num[i + 1];
    }
    num[i] = temp;
  }

  public static void printArray(int[] num){
    for (int i =0; i<num.length;i++)
    {
      System.out.print(num[i]);
    }
  }


  public static void main(String[] args) {

    int[] num = {1,2,3,4,5,6,7};
    int[] d = {1,2};
    int n = num.length;

    rotateLeft(num,d,n);
    printArray(num);


  }

}


