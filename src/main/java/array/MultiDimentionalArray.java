package array;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = {

                {1,1,1,1},
                {2,2,2,2},
                {3,3,3,3}
        };

        int[][] arr2 = {
                {3,3,3,3},
                {4,4,4,4},
                {5,5,5,5}
        };

        System.out.println("Mtrix A");
        for (int i=0; i<arr.length; i++)
        {
            for (int j = 0; j<arr[i].length;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        System.out.println("Mtrix B");
        for (int i=0;i<arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }


        int[][] add = new int[3][3];

        for (int i=0;i<add.length;i++)
        {
            for (int j=0;j<add[i].length;j++)
            {
                add[i][j] = arr[i][j] + arr2[i][j];
            }
            System.out.println();
        }

        System.out.println("Matrix add");
        for (int i=0;i<add.length;i++)
        {
            for (int j=0;j<add[i].length;j++)
            {
                System.out.print(add[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
