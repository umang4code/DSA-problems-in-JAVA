/**
 * Definition for an interval.
 *
 * } public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int s=Math.min(newInterval.start,newInterval.end);
        int e=Math.max(newInterval.start,newInterval.end);
        //System.out.print("\nNewInterval.start: "+newInterval.start+"\nnewInterval.end: "+newInterval.end);
        int len=intervals.size();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        boolean added=false;
        int i=0;
        ArrayList<Interval> res=new ArrayList<>();
        while(i<len)
        {
            while(i<len&&Math.max(s,intervals.get(i).start)<Math.min(e,intervals.get(i).end))
            {
                min=Math.min(s,Math.min(min,intervals.get(i).start));
                max=Math.max(e,Math.max(max,intervals.get(i).end));
                i++;
            }
            if(min!=Integer.MAX_VALUE&&max!=Integer.MIN_VALUE)
            {
                res.add(new Interval(min,max));
                added=true;
                min=Integer.MAX_VALUE;
                max=Integer.MIN_VALUE;
            }
            if(i<len)
            {
                if(s<intervals.get(i).start)
                {
                    if(!added)
                    {
                        res.add(newInterval);
                        added=true;
                    }
                        
                    res.add(intervals.get(i));
                }
                else if(s>intervals.get(i).end)
                {
                    res.add(intervals.get(i));
                }
            }
            i++;
        }
        if(!added)
            res.add(newInterval);
        return res;
    }
}
