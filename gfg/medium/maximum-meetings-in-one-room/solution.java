import java.util.*;
class Solution {
    static class Meeting{
        int start;int end;int position;
        Meeting(int start,int end,int position){
            this.start = start;
            this.end=end;
            this.position =position;
        }
    }
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        // code here
        int n=s.length;
        Meeting [] meeting = new Meeting[n];
        for(int i=0;i<n;i++) meeting[i] = new Meeting(s[i],f[i],i+1);
        
        Arrays.sort(meeting,(a,b)->a.end-b.end);
        
        ArrayList<Integer> positionArray = new ArrayList<>();
        int count =1;
        int freeTime = meeting[0].end;
        positionArray.add(meeting[0].position);
        for(int i=1;i<n;i++){
            if(meeting[i].start > freeTime){
                count++;
                freeTime = meeting[i].end;
                positionArray.add(meeting[i].position);
            }
        }
        Collections.sort(positionArray);
        return positionArray;
        
    }
}