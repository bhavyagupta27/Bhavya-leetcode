class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i<startTime.length; i++){
                if(queryTime>=startTime[i] && queryTime<=endTime[i]){
                    count++;
            }
        }
        return count;
    }
}