package array;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum_Brute_Force_Solution {
    public static void main(String[] args) {

        int[] numbers = new int[]{4,8,9,4,5,6};
        int target = 17;
        int[] result = twoSum(numbers,target);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int numbers[],int target) {

        for (int i=0;i<numbers.length;i++) {
            for (int j=i+1;j<numbers.length;j++)
            {
                if ((numbers[i] + numbers[j]) == target) {
                     return new int[]{i,j};
                }
                i++;

            }
        }
        return new int[] {-1,-1};
    }

}
