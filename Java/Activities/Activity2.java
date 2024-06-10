package Activity2;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        
        int[] array = {10, 77, 10, 54, -11, 10};
        System.out.println("Original value: " + Arrays.toString(array));
    
       int fixedSum = 30;

        System.out.println("Result: " + result(array, fixedSum));
    }

    public static boolean result(int[] numbers, int fixedSum) {
        int temp_sum = 0;
        int searchNum = 10;

        for (int number : numbers) {
            
            if (number == searchNum) {
                temp_sum += searchNum;
            }
            if (temp_sum > fixedSum) {
                break;
            }
        }
        return temp_sum == fixedSum;
    }
}