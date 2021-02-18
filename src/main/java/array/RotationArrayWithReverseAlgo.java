package array;

// Java program to rotate an array by d elements
public class RotationArrayWithReverseAlgo {

  public static void rotateLeft(int[] num, int[] d, int n) {
    int temp = d[0];
    int i;
    for(i=0;i<d.length-1;i++) { //1,2
     // System.out.print(d[i]);
      //rotateArray(num,n);
      d[i] = d[i+1]; // i = 2
      d[i+1] = temp; //temp = 1
      temp = d[i+1]; // i+1 = 2
     // System.out.print(d[i] + " ");
    }
    System.out.print(d[i]);
  }

  /*public static void rotateArray(int num[],int n){
    int temp = num[0];
    int i;
    for(i=0;i<n-1;i++) {
      num[i] = num[i + 1];
    }
    num[i] = temp;
  }*/

  /*public static void printArray(int[] num){
    for (int i =0; i<num.length;i++)
    {
      System.out.print(num[i]);
    }
  }*/


  public static void main(String[] args) {

    int[] num = {1,2,3,4,5,6,7};
    int[] d = {1,2};
    int n = num.length;

   rotateLeft(num,d,n);
  //  printArray(num);


  }

}


