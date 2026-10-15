class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i< operations.length ; i++){
            if(operations[i].equals("C")){
                st.pop();
            }else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }else if(operations[i].equals("+")){
                int topScore = st.pop();
                int secScore = st.peek();
                int newScore = topScore+secScore;

                st.push(topScore);
                st.push(newScore);
            }else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int totalSum = 0;
        for (int score : st) {
            totalSum += score;
        }
        
        return totalSum;
    }
}