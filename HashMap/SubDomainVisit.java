/*
 * A website domain like "discuss.leetcode.com" consists of various subdomains. At the top level, we have 
 * "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When 
 * we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and 
 * "com" implicitly.
 * 
 * Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), 
 * followed by a space, followed by the address. An example of a count-paired domain might be
 *  "9001 discuss.leetcode.com".
 *  
 *  We are given a list cpdomains of count-paired domains. We would like a list of count-paired domains, 
 *  (in the same format as the input, and in any order), that explicitly counts the number of visits to each 
 *  subdomain.
 */

import java.util.*;

public class SubDomainVisit {
	
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<String> result = new ArrayList<String>();
        for(String cpdomain:cpdomains){
        	//Split on space to get count
            String[] domain = cpdomain.split("\\s+");
            Integer count = Integer.parseInt(domain[0]);
            
            //Split on . to get domain information
            String[] web = domain[1].split("\\.");
            String s = "";
            
            //Get domain and sub-domain count
            for(int i = web.length -1;i>=0;i--){
                s = (i == web.length -1? web[i]:web[i]+"."+s);
                map.put(s,map.getOrDefault(s,0)+count);
            }
        }
        
        //Loop through map and add result to list
        for(String key:map.keySet()){
            Integer count = map.get(key);
            String val = ""+count + " " +key;
            result.add(val);
        }
        return result;
    }
	
	public static void main(String[] args) {
		SubDomainVisit object = new SubDomainVisit();
		
		//TestCase
		String[] cpdomains = {"9001 discussion.leetcode.com","250 problems.leetcode.com"};
		List<String> result = object.subdomainVisits(cpdomains);
		for(String res:result)
			System.out.println(res);
	}

}
