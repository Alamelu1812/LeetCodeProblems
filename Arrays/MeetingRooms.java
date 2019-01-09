
import java.util.*;

public class MeetingRooms {
	
	 public static class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
		 }
	 
	public int minMeetingRooms(Interval[] intervals) {
		if(intervals.length == 0)
			return 0;
		
		//Intervals sorted based on start time
		Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1.start,i2.start));
		
		//Min Heap created to keep track of ending times of meetings for the rooms
		PriorityQueue<Integer> endingTime = new PriorityQueue<Integer>();
		
		//The ending time for the first meeting is added
		endingTime.add(intervals[0].end);
		
		//Iterate for each interval
		for(int i=1;i<intervals.length;i++) {
			//If any room becomes free, then the ending time of the room is removed
			if(endingTime.peek() <= intervals[i].start) 
				endingTime.poll();
			//Ending time of new meeting added
			endingTime.add(intervals[i].end);	
		}
		
		//Size of min heap gives the number of rooms
		return endingTime.size();
    }
	
	public static void main(String[] args) {
		MeetingRooms object = new MeetingRooms();
		
		//TestCase - Input
		Interval interval1 = new Interval(0,30);
		Interval interval2 = new Interval(5,10);
		Interval interval3 = new Interval(15,20);
		Interval[] intervals = {interval1,interval2,interval3};
		
		System.out.println(object.minMeetingRooms(intervals));
	}
}
