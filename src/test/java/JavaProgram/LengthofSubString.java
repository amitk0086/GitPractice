package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class LengthofSubString {

    public static void main(String args[]) {
        String str = "abcdbcdg";
        int left = 0, right = 0;
        int max = 0;

        Set<Character> seen = new HashSet();


        while(right<str.length())
        {
            char c = str.charAt(right);
            if (seen.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (str.charAt(left) != c) {
                    seen.remove(str.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }


        System.out.print(max);

    }

}
