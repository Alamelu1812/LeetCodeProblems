class Solution {
    public String countAndSay(int n) {
        
        //Base Case - First Sequence
        if(n == 1)
            return "1";
        
        //Construct Previous Sequence
        String prevString = countAndSay(n-1);
        
        StringBuilder currString = new StringBuilder();
        
        int i = 0;
        
        while(i<prevString.length()){
            //Check the following characters for any repetition
            int j = i+1;
            while(j<prevString.length() && prevString.charAt(i) == prevString.charAt(j))
                j++;
                
            //Append the count and the character
            currString.append(j-i);
            currString.append(prevString.charAt(i));
            
            //Move the window to the next new character
            i = j;
        }
        
        return currString.toString();
    }
}
