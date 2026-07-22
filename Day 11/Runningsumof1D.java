class Solution {
    public int[] runningSum(int[]a) {
        for (int j=1;j<a.length;j++){
            a[j]=a[j]+a[j-1];
        }
     return a;
    }
  
}
