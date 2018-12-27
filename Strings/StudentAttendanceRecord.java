/*
 * 
 * You are given a string representing an attendance record for a student. The record only contains the 
 * following three characters:
 * 'A' : Absent.
 * 'L' : Late.
 * 'P' : Present.
 * A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or
 *  more than two continuous 'L' (late).
 *  
 *  You need to return whether the student could be rewarded according to his attendance record.
 * 
 */

public class StudentAttendanceRecord {
	
    public boolean checkRecord(String s) {
        boolean foundOneA = false;
        
        for(int i=0;i<s.length();i++){
        	
        	//If more than one day of absentia return false immediately
            if(s.charAt(i)=='A'){
                if(foundOneA)
                    return false;
                foundOneA = true;
            }
            
            //If more than 2 days of late, return false immediately
            else if(s.charAt(i) == 'L'){
                if(i-1>=0 && i-2>= 0 && s.charAt(i-1) =='L' && s.charAt(i-2) =='L')
                    return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	StudentAttendanceRecord object = new StudentAttendanceRecord();
    	
    	String input1= "PPALLP";
    	System.out.println("The result for input "+input1+" is "+object.checkRecord(input1));
    	
    	String input2= "PPALLL";
    	System.out.println("The result for input "+input2+" is "+object.checkRecord(input2));
    }

}
