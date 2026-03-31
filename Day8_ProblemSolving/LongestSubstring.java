import java.util.*;

class LongestSubstring{
    public static int longestSubstring(String s)
    {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for(int right = 0; right < s.length(); right++)
        {
            char c = s.charAt(right);
            while(set.contains(c))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            int currLength = right - left + 1;
            maxLength = Math.max(maxLength, currLength);
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        int result = longestSubstring(s);
        System.out.println(result);
    }
}