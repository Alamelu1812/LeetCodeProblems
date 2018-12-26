
import java.util.*;

public class GroupAnagrams {
	
	public String charSort(String str){
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        
        //Anagrams have same sorted sequence and hence used as a key
        //All anagrams will be added to the list corresponding to key(sorted characters)
        
        for(String str:strs){
            String key = charSort(str);
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(str);
                map.put(key,list);
            }
            else{
                List<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key,list);
            }
        }
        
        //Retrieve all values - order does not matter
        for(String key:map.keySet()){
            List<String> list = map.get(key);
            result.add(list);
        }
        return result;
    }
    
    public static void main(String[] args) {
    	GroupAnagrams object = new  GroupAnagrams();
    	
    	//TestCase - Input
    	String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    	List<List<String>> result = object.groupAnagrams(strs);
    	
    	//TestCase - Output
    	for(List<String> list:result) {
    		for(String s:list)
    			System.out.print(s+" ");
    		System.out.println();
    	}
    }
    
    
    

}
