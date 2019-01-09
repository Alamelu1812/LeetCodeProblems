/*
 * There is a brick wall in front of you. The wall is rectangular and has several rows of bricks. The bricks have the same 
 * height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.
 * 
 * The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in 
 * this row from left to right.
 * 
 * If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to draw 
 * the line to cross the least bricks and return the number of crossed bricks.
 *
 * You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross 
 * no bricks.
 *
 */

class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> boundryEnd = new HashMap<Integer,Integer>();
        for(int i=0;i<wall.size();i++){
            int sum = 0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                sum += wall.get(i).get(j);
                boundryEnd.put(sum,boundryEnd.getOrDefault(sum,0)+1);
            }
        }
        
        int leastBricks = wall.size();
        for(Integer sum:boundryEnd.keySet()){
            leastBricks = Math.min(leastBricks,wall.size() - boundryEnd.get(sum));
        }
        
        return leastBricks;
    }
}
