
/*
 * Given a collection of intervals, merge all overlapping intervals.
 */

import java.util.*;
public class MergeIntervals {
	
	public static class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals) {
		Collections.sort(intervals, (i1,i2) -> Integer.compare(i1.start,i2.start));
        List<Interval> result = new ArrayList<Interval>();
        int i =0;
        
        while(i<intervals.size()) {
        	Interval currInterval = intervals.get(i);
        	int maxSoFar = currInterval.end;
        	int j = i+1;
        	
        	while(j<intervals.size() && 
        			currInterval.start <= intervals.get(j).start &&  maxSoFar >= intervals.get(j).start){
        		maxSoFar = Math.max(maxSoFar, intervals.get(j).end);
        		j++;
        	}
        	
        	currInterval.end = maxSoFar;
        	result.add(currInterval);
        	i = j;
        }
        
        return result;
    }
	
	public static void main(String[] args) {
		MergeIntervals object = new MergeIntervals();
		
		//TestCase - Input
		List<Interval> input = new ArrayList<Interval>();
		input.add(new Interval(15,18));
		input.add(new Interval(5,10));
		input.add(new Interval(2,6));
		input.add(new Interval(1,3));
		
		//TestCase - Output
		List<Interval> output = object.merge(input);
		for(Interval i:output)
			System.out.println(i.start+" "+i.end);
	}
}
