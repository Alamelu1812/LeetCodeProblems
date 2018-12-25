/*
 * There is a robot starting at position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, 
 * judge if this robot ends up at (0, 0) after it completes its moves.
 * 
 * The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid 
 * moves are R (right), L (left), U (up), and D (down). 
 * If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.
 * 
 * Note: The way that the robot is "facing" is irrelevant. "R" will always make the robot move to the right once,
 * "L" will always make it move left, etc. Also, assume that the magnitude of the robot's movement is the same for each move.
 */
public class RobotCircle {
	
	public boolean judgeCircle(String moves) {
        int horizontalMovement = 0, verticalMovement = 0;
        for(char c:moves.toCharArray()){
            if(Character.toUpperCase(c)=='R') 
                horizontalMovement++;
            else if(Character.toUpperCase(c)=='L')
                horizontalMovement--;
            else if(Character.toUpperCase(c)=='U')
                verticalMovement++;
            else if(Character.toUpperCase(c)=='D')
                verticalMovement--;
            //No action for any other character
        }
        return horizontalMovement==0 && verticalMovement==0;
    }
	
	public static void main(String[] args) {
		RobotCircle object = new RobotCircle();
		
		//TestCase1
		String input1 = "ULDR";
		System.out.println(object.judgeCircle(input1));
		
		//TestCase1
		String input2 = "ULLR";
		System.out.println(object.judgeCircle(input2));
				
		//TestCase1
		String input3 = "RRRR";
		System.out.println(object.judgeCircle(input3));
	}

}
