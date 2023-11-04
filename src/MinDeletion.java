/*We are given a string S of length N consisting only of letters 'A' and/or 'B'.
Our goal is to obtain a string in the format "A...AB...B" (all letters 'A' occur before all letters 'B') by deleting some letters from S.
In particular, strings consisting only of letters 'A' or only of letters 'B' fit this format.
        Write a function:
class Solution { public int solution(String S); }
that, given a string S, returns the minimum number of letters that need to be deleted from S in order to obtain a string in the above format.*/

class MinDeletion {
    public static void main(String[] args) {

        System.out.println( "Min Deletion Needed for String BAAABAB is: " + solution("BAAABAB") );
        System.out.println( "Min Deletion Needed for String BBABAA is: " + solution("BBABAA") );
        System.out.println( "Min Deletion Needed for String AABBBB is: " + solution("AABBBB") );
    }
    public static int solution(String S) {
        int countB = 0;
        int deletionsNeeded = 0;

        for (char c : S.toCharArray()) {
            if(c == 'A') {
                deletionsNeeded = Math.min(countB, deletionsNeeded +1);
            } else {
                countB++;
            }
        }

        return deletionsNeeded;
    }

}
