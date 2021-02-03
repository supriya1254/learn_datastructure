package array;

public class WaveArray {

  public static void main(String[] args) {
    int[] sortedArray = new int[]{9, 2, 6, 4, 18,66};
    int[] foundWaveArray = waveArray(sortedArray);
    for(int s: foundWaveArray) {
      System.out.print(s);
    }
  }

  public static int[] waveArray(int[] sortedArray) {

    int temp = 0;
    for (int i = 0; i <sortedArray.length-1; i+= 2) {
      if (sortedArray[i] < sortedArray[i + 1]) {
        temp = sortedArray[i];
        sortedArray[i] = sortedArray[i + 1];
        sortedArray[i + 1] = temp;
      }
    }
    return sortedArray;
  }
}
