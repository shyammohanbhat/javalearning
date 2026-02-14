package com.leetcode.twopointer.reverse_string;

public class Solution {
    /*
    * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
    */
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while(left < right){
            boolean isRightVowel
                    = isVowel(Character.toLowerCase(sb.charAt(right)));
            boolean isLeftVowel
                    = isVowel(Character.toLowerCase(sb.charAt(left)));

            if(isRightVowel && isLeftVowel) {
                char temp = sb.charAt(right);
                sb.setCharAt(right, sb.charAt(left));
                sb.setCharAt(left, temp);
                left ++;
                right --;
            }
            else if(!isLeftVowel && isRightVowel) {
                left++;
            }
            else if(isLeftVowel && !isRightVowel) {
                right--;
            } else{
                left++;
                right--;
            }
        }
        return sb.toString();
    }

    public boolean isVowel(char s) {
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s =='u'){
            return true;
        }
        return false;
    }
}
