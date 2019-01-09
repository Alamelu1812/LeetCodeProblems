/* 
 * A self-dividing number is a number that is divisible by every digit it contains.
 *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * 
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * 
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 *
 */
 
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<Integer>();
        for(int iter = left;iter <= right;iter++){
            int number = iter;
            
            boolean selfDividing = true;
            
            while(number > 0){
                int reminder = number %10;
                
                if(reminder == 0)
                    selfDividing = false;
                
                else if(iter % reminder != 0)
                    selfDividing = false;
                
                number = number / 10;
            }
            
            if(selfDividing)
                result.add(iter);
        }
        return result;
    }
}
