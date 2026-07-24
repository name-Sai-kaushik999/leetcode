import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int count = 0;

        for(int i = 0;i< s.length() ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
                count++;
            }
        }

        for(int i = 0; i < (count)/2 ; i++){
            if(sb.charAt(i) != sb.charAt(count-1-i)){
                flag = false;
                break;
            }
        }

        return flag;
    }
}