import java.util.*;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        int[] count = new int[1001];

    
        for (int x : arr1) {
            count[x]++;
        }

        int index = 0;

        for (int x : arr2) {
            while (count[x] > 0) {
                arr1[index++] = x;
                count[x]--;
            }
        }

        for (int i = 0; i <= 1000; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }

        return arr1;
    }
}