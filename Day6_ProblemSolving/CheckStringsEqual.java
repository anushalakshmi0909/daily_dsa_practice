import java.util.*;

class Solution {

    public static boolean canBeEqual(String s1, String s2) {

        boolean groupAValid = false;
        boolean groupBValid = false;

        // Check group A (indices 0 and 2)
        if ((s1.charAt(0) == s2.charAt(2) && s2.charAt(0) == s1.charAt(2)) ||
            (s1.charAt(0) == s2.charAt(0) && s1.charAt(2) == s2.charAt(2))) {
            groupAValid = true;
        }

        // Check group B (indices 1 and 3)
        if ((s1.charAt(1) == s2.charAt(3) && s2.charAt(1) == s1.charAt(3)) ||
            (s1.charAt(1) == s2.charAt(1) && s1.charAt(3) == s2.charAt(3))) {
            groupBValid = true;
        }

        return groupAValid && groupBValid;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Input strings
        String s1 = in.nextLine();
        String s2 = in.nextLine();


        boolean result = canBeEqual(s1, s2);

        System.out.println(result);

        in.close();
    }
}