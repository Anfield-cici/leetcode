package com.springmvc.leetcode.tiku;

import java.util.HashMap;

public class leetcode03 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        int i=0;
        int max=0,count=0;
        for(;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                count++;
            }else{
                if(count>max) max=count;
                i=map.get(s.charAt(i))+1;
                count=0;
                map.clear();
            }
        }
        return max;
    }

}
