
/*
 * Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many
 * days you would have to wait until a warmer temperature. If there is no future day for which this is possible,
 * put 0 instead.
 * 
 * For example, given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be 
 * [1, 1, 4, 2, 1, 1, 0, 0].
 * 
 * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in 
 * the range [30, 100].
 * 
 */

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] T) {
		
		//Idea: Two loops: On finding a warmer temperature, break
        int[] result = new int[T.length];
        for(int i=0;i<T.length;i++){
            int j=i+1;
            for(;j<T.length;j++){
                if(T[j] > T[i])
                    break;
            }
            result[i] = j==T.length?0:j-i;
        }
        return result;
    }
	
	public static void main(String[] args) {
		DailyTemperatures object = new DailyTemperatures();
		
		//TestCase
		int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] output = object.dailyTemperatures(input);
		for(int i=0;i<output.length;i++)
			System.out.println(output[i]);
	}

}
