package Programmers_practice;

import java.util.Arrays;

public class max {
    public int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-2]*numbers[numbers.length-1];
    }
}
