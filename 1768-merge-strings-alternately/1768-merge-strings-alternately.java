class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i = 0;
       int j = 0;
       String merged = "";
       while(i<word1.length() && j<word2.length()){
        merged += word1.charAt(i);
        i++;
        merged += word2.charAt(j);
        j++;
       } 
       if(i<word1.length()){
        merged += word1.substring(i);
       }else if(j<word2.length()){
        merged += word2.substring(j);
       }
       return merged;
    }
}