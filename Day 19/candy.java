import java.util.HashSet;

class Solution {
    public int distributeCandies(int[] candyType) {

        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        int uniqueTypes = set.size();
        int canEat = candyType.length / 2;

        return Math.min(uniqueTypes, canEat);
    }
}