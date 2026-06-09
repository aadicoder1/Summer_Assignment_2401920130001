package week2.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> result = new ArrayList<>();
        if(p.length()>s.length()){
            return result;
        }
        int[] pFreq=new int[26];
        int[] window=new int[26];
        for(int i=0;i<p.length();i++){
            pFreq[p.charAt(i)-'a']++;
            window[s.charAt(i)-'a']++;
        }
        if (Arrays.equals(pFreq,window)){
            result.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            window[s.charAt(i)-'a']++;
            window[s.charAt(i-p.length())-'a']--;
            if (Arrays.equals(pFreq, window)){
                result.add(i-p.length()+1);
            }
        }
        return result;
    }
}
