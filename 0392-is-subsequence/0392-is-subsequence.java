import java.util.*;

class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int i = 0;

        if(n != 0){
            for(int j = 0 ; j < t.length() ; j++){
                if(i<n){
                    if(t.charAt(j) == s.charAt(i)){
                        i++;
                    }
                }
            }

            if(i == n){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return true;
        }
    }
}