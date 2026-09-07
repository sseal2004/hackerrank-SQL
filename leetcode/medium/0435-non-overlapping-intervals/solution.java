import java.util.*;
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int remove=0;int endTime=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>= endTime) endTime = intervals[i][1];
            else remove++;
        }
        return remove;
    }
}