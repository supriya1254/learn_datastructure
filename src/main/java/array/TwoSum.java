package array;


import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {

        int[] numbers = new int[]{4,8,9,4,5,6};
        int target = 56;
        int result[] = twoSum(numbers,target);
        System.out.println(result[1] + "," + result[0]);
    }

    public static int[] twoSum(int numbers[],int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i =0; i<numbers.length;i++) {
            int foundNum = target-numbers[i]; // jo bhi substraction hua uske bad kitna chahiye 8-4 = 4(itna aur chahiye)
            if(map.containsKey(foundNum)) {
                return new int[]{i,map.get(foundNum)};
            }
            map.put(numbers[i],i); // {4,0}
        }
        return new int[]{0,0};

    }

}
