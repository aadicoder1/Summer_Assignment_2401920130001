package week2.day2;

import java.util.Arrays;

public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int[] freq1=new int[26];
        for (char ch:s1.toCharArray()) {
            freq1[ch-'a']++;
        }
        for(int i=0;i<=s2.length()-s1.length();i++){
            int[] freq2=new int[26];
            for(int j=i;j<i+s1.length();j++){
                freq2[s2.charAt(j)-'a']++;
            }
            if (Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}
