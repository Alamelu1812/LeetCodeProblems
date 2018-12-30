
/*
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of 
 * non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 */
public class SegmentCount {
	
	public int countSegments(String s) {
        if(s==null || s.length()==0)
            return 0;
        int segmentCount = 0;

        for (int i = 0; i < s.length()-1; i++) {
            if ((s.charAt(i) == ' ') && s.charAt(i+1) != ' ') {
                segmentCount++;
            }
        }

        return segmentCount+1;//+1 for the last word
    }
	
	public static void main(String[] args) {
		SegmentCount object = new SegmentCount();
		String input = "Hello, my name is John";
		int output = object.countSegments(input);
		System.out.println("Number of segments "+output);
	}

}
