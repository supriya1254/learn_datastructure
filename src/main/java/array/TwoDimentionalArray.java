package array;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[][]{

                {1, 2, 4, 5},
                {6, 7, 8, 9}
        };

        for (int i=0; i<arr.length; i++)
        {
            for (int j = 0; j<arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
