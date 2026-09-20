class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i,j;
       int min = Math.min(word1.length(),word2.length());
       String merged = "";
       for(i = 0, j=0 ; i< min ;i++,j++){
        merged += word1.charAt(i);
        merged += word2.charAt(j);
       } 
       if(i<word1.length()){
        merged += word1.substring(i);
       }else if(j<word2.length()){
        merged += word2.substring(j);
       }
       return merged;
    }
}