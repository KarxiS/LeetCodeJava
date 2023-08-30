public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        int sizeString = 0;
        String  substring = "";

        for (int i = 0; i < s.length(); i++) {
            String substringLoop = "";
            for (int j = i; j < s.length(); j++) {

                if (!substringLoop.contains(String.valueOf(s.charAt(j)))) {
                    if (sizeString <= j - i) {

                        substringLoop = s.substring(i, j+1);

                    }
                }else {
                    break;
                }


            }

            if(substringLoop.length()>substring.length()){
                substring=substringLoop;
            }
        }
        return substring.length();
    }
}
