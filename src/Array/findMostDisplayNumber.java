package Array;

import java.util.*;

public class findMostDisplayNumber {
    public static void main(String[] args) {
        findMostDisplayNumber s = new findMostDisplayNumber();
        int[] arr = {1, 1, 3, 3, 3, 4, 5, 6, 7, 8, 4, 5, 8,1,1};
        System.out.println(s.findMostDisplayNumber(arr));

    }

    public static int findMostDisplayNumber(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, Integer> m = new HashMap<>();
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            if (m.containsKey(key)){
                int value = m.get(key);
                value++;
                m.put(key,value);
            } else {
                m.put(key,1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int num: m.keySet()) {
            if (m.get(num) > max) {
                max = m.get(num);
                res = num;
            }
        }
        return res;
    }
}





