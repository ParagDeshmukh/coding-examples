/*There are N coins, each showing either heads or tails.
We would like all the coins to form a sequence of alternating heads and What is the minimum number of coins that must be reversed achieve this?

Write a function:
class Solution [ public int solution(int[] A); }
that, given an array A consisting of N integers representing the coins, returns the minimum number of coins that must be reversed.
Consecutive elements of array A represent consecutive coins : contain either a 0 (heads) or a 1 (tails).*/


class CoinFlip {
    public static void main(String[] args) {
        int[] A = new int[]{1,0,1,0,1,1};
//        int[] A = new int[]{1,1,0,1,1};
//        int[] A = new int[]{0,1,0};
//        int[] A = new int[]{0,1,1,0};
        System.out.println( solution(A));
    }
    public static int solution(int[] A) {
        int flipsNeeded = 0;
        int expectedValue = 0;

        for (int coin: A) {
            if(coin != expectedValue) {
                flipsNeeded ++;
            }
            expectedValue = 1-expectedValue;
        }
        return Math.min(flipsNeeded, A.length - flipsNeeded);
    }

}
